package am.concur.users.users.controller;

import am.concur.users.users.request.UserCorporateRequest;
import am.concur.users.users.response.Companys;
import am.concur.users.users.response.CorporateResponse;
import am.concur.users.users.response.UserCorporate;
import am.concur.users.users.service.CorporateUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CorporateController {

    private org.apache.logging.log4j.Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private CorporateUserService corporateUserService;

    @PostMapping("/coporate/user")
    public ResponseEntity<CorporateResponse> getCorporate(@RequestBody UserCorporateRequest userCorporateRequest) throws JsonProcessingException, URISyntaxException {
        logger.info("--CONNECTION-CONCUR-USERS-MS --getCorporate --received request [{}]", new ObjectMapper().writeValueAsString(userCorporateRequest));
        return new ResponseEntity(corporateUserService.getCorporateResponse(userCorporateRequest), HttpStatus.OK);
    }
}
