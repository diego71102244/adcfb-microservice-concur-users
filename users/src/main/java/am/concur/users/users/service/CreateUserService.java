package am.concur.users.users.service;

import am.concur.users.users.client.AuthClient;
import am.concur.users.users.repository.UserConcurRepository;
import am.concur.users.users.request.UserAmexDAO;
import am.concur.users.users.request.UserConcurAmxRequestDTO;
import am.concur.users.users.response.AuthUserResponseDTO;
import am.concur.users.users.utils.Utils;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CreateUserService {

    @Autowired
    private UserConcurRepository userConcurRepository;

    @Autowired
    private AuthClient authClient;

    @Value("${auth.client.id}")
    private String clientId;

    @Value("${auth.client.secret}")
    private String clientSecret;

    @Value("${auth.client.grant.type}")
    private String grantType;

    public UserAmexDAO createUserService(UserConcurAmxRequestDTO userAmexRequest) throws JSONException {
        UserAmexDAO user= userConcurRepository.findByLastNameAndLoyaltyNumber(userAmexRequest.getLastName(),userAmexRequest.getLoyaltyNumber());
        if (user == null){
            return userConcurRepository.insert(saveUser(userAmexRequest,getUserToken(userAmexRequest)));
        } else{
            return userConcurRepository.save(buildFromExistingUser(user,userAmexRequest, getUserToken(userAmexRequest)));
        }
    }

    public AuthUserResponseDTO getUserToken(UserConcurAmxRequestDTO userAmexRequest) throws JSONException {
        return authClient.getToken(clientId,clientSecret,grantType,userAmexRequest.getUserId(),userAmexRequest.getRequestToken(), "authtoken");
    }

    public UserAmexDAO buildFromExistingUser(UserAmexDAO userDAO, UserConcurAmxRequestDTO user, AuthUserResponseDTO authUserResponseDTO) throws JSONException {
        userDAO.set_id(user.getId());
        userDAO.setFirstName(user.getFirstName());
        userDAO.setLastName(user.getLastName());
        userDAO.setLoyaltyNumber(user.getLoyaltyNumber());
        userDAO.setMiddleName(user.getMiddleName());
        userDAO.setRequestToken(user.getRequestToken());
        userDAO.setStatus(user.getStatus());
        userDAO.setUri(user.getUri());
        userDAO.setUserId(user.getUserId());
        userDAO.setEmail1(user.getEmail1());
        userDAO.setEmail2(user.getEmail2());
        userDAO.setEmail3(user.getEmail3());
        userDAO.setEmail4(user.getEmail4());
        userDAO.setEmail5(user.getEmail5());
        userDAO.setAccess_token(authUserResponseDTO.getAccesToken());
        userDAO.setRefresh_token(authUserResponseDTO.getRefreshToken());
        userDAO.setSub(Utils.decodeAndExtractSubValueFromToken(authUserResponseDTO.getIdToken()));
        userDAO.setGeolocation(authUserResponseDTO.getGeolocation());
        userDAO.setUpdatedAt(new Date());
        return userDAO;
    }
    public UserAmexDAO saveUser(UserConcurAmxRequestDTO user, AuthUserResponseDTO authResponseDTO) throws JSONException {

        UserAmexDAO userToUpdate = new UserAmexDAO();
        userToUpdate.set_id(user.getId());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setLoyaltyNumber(user.getLoyaltyNumber());
        userToUpdate.setMiddleName(user.getMiddleName());
        userToUpdate.setRequestToken(user.getRequestToken());
        userToUpdate.setStatus(user.getStatus());
        userToUpdate.setUri(user.getUri());
        userToUpdate.setUserId(user.getUserId());
        userToUpdate.setEmail1(user.getEmail1());
        userToUpdate.setEmail2(user.getEmail2());
        userToUpdate.setEmail3(user.getEmail3());
        userToUpdate.setEmail4(user.getEmail4());
        userToUpdate.setEmail5(user.getEmail5());
        userToUpdate.setAccess_token(authResponseDTO.getAccesToken());
        userToUpdate.setRefresh_token(authResponseDTO.getRefreshToken());
        userToUpdate.setSub(Utils.decodeAndExtractSubValueFromToken(authResponseDTO.getIdToken()));
        userToUpdate.setGeolocation(authResponseDTO.getGeolocation());

        return userToUpdate;
    }
}
