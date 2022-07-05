package am.concur.users.users.controller;

import am.concur.users.users.request.UserAmexDAO;
import am.concur.users.users.request.UserConcurAmxRequestDTO;
import am.concur.users.users.service.CreateUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @Autowired
    private CreateUserService createUserService;

    @PostMapping("/concurUser/create")
    public ResponseEntity<UserAmexDAO> createUser(@RequestParam("user") String userAmexRequest) throws JSONException, JsonProcessingException {
        return new ResponseEntity(createUserService.createUserService(new ObjectMapper().readValue(userAmexRequest, UserConcurAmxRequestDTO.class)), HttpStatus.CREATED);
    }
}
