package am.concur.users.users.client;

import am.concur.users.users.configuration.FeignConfigurationAuth;
import am.concur.users.users.response.AuthUserResponseDTO;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "authclient", url = "${feign.client.url.concur.auth}", configuration = FeignConfigurationAuth.class)
public interface AuthClient {


    @RequestLine("POST /oauth2/v0/token")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    public AuthUserResponseDTO getToken(
            @Param("client_id") String clientId,
            @Param("client_secret") String clientSecret,
            @Param("grant_type") String grantType,
            @Param("username") String username,
            @Param("password") String requestToken,
            @Param("credtype") String authtoken
    );
}
