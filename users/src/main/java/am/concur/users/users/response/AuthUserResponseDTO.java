package am.concur.users.users.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AuthUserResponseDTO {
    @JsonProperty("access_token")
    String accesToken = null;
    @JsonProperty("token_type")
    String tokenType = null;
    String expiresIn = null;
    String scope = null;
    String refreshToken = null;
    String error = null;
    String status = null;
    String refreshExpiresIn = null;
    String geolocation = null;
    @JsonProperty("id_token")
    String idToken = null;
}
