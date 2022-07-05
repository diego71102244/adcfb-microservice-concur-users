package am.concur.users.users.service;

import am.concur.users.users.client.TravelProfileClient;
import am.concur.users.users.repository.UserConcurRepository;
import am.concur.users.users.request.UserAmexDAO;
import am.concur.users.users.request.UserCorporateRequest;
import am.concur.users.users.response.Companys;
import am.concur.users.users.response.CorporateResponse;
import am.concur.users.users.response.UserCorporate;
import am.concur.users.users.xsd.ProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CorporateUserService {

    @Autowired
    private UserConcurRepository userConcurRepository;

    @Autowired
    private TravelProfileClient travelProfileClient;

    public CorporateResponse getCorporateResponse(UserCorporateRequest userCorporate) throws URISyntaxException {
        UserAmexDAO user = userConcurRepository.findByLastNameAndLoyaltyNumber(userCorporate.getLastName(),userCorporate.getLoyaltyNumber());
        if(user != null){
            ProfileResponse profileResponse = travelProfileClient.getProfile(new URI(user.getGeolocation().concat("/api/travelprofile/v2.0/profile")),"Bearer ".concat(user.getAccess_token()),"application/xml");
            CorporateResponse corporateResponse = new CorporateResponse();
            corporateResponse.setCorporate(true);
            if(profileResponse.getGeneral() != null){
                UserCorporate userCorporates = new UserCorporate();
                List<Companys> lstCompanys= new ArrayList<Companys>();
                Companys companys = new Companys();
                companys.setName(profileResponse.getGeneral().getCompanyName());
                companys.setEmployeId(profileResponse.getGeneral().getCompanyEmployeeID());
                companys.setId(profileResponse.getGeneral().getCompanyID());
                lstCompanys.add(companys);
                userCorporates.setUserCorporates(lstCompanys);
                corporateResponse.setUserCorporates(userCorporates);
            }
            return corporateResponse;
        } else{
            CorporateResponse corporateResponse = new CorporateResponse();
            corporateResponse.setCorporate(false);
            UserCorporate userCorporates = new UserCorporate();
            userCorporates.setUserCorporates(new ArrayList<Companys>());
            corporateResponse.setUserCorporates(userCorporates);
            return corporateResponse;
        }
    }
}
