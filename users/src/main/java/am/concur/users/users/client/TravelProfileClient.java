package am.concur.users.users.client;

import am.concur.users.users.configuration.FeignConfiguration;
import am.concur.users.users.configuration.FeignConfigurationAuth;
import am.concur.users.users.response.AuthUserResponseDTO;
import am.concur.users.users.xsd.ProfileResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.URI;

@FeignClient(name = "travelProfileclient", url = "${feign.client.url.concur.auth}", configuration = FeignConfiguration.class)
public interface TravelProfileClient {


    @GetMapping()
    public ProfileResponse getProfile(
            URI url,
            @RequestHeader("Authorization") String authorization,
            @RequestHeader("Accept") String accept
    );
}
