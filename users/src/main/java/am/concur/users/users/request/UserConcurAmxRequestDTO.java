package am.concur.users.users.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


        @Getter
        @Setter
        @Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserConcurAmxRequestDTO {

    public UserConcurAmxRequestDTO(){
        super();
    }

    private String id;

    @JsonProperty("firstName")
    private String firstName;
            @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
            @JsonProperty("loyaltyNumber")
    private String loyaltyNumber;
            @JsonProperty("status")
    private String status;
            @JsonProperty("requestToken")
    private String requestToken;
            @JsonProperty("lastModified")
    private String lastModified;
            @JsonProperty("userId")
    private String userId;
            @JsonProperty("uri")
    private String uri;
            @JsonProperty("email1")
    private String email1;
            @JsonProperty("email2")
    private String email2;
            @JsonProperty("email3")
    private String email3;
            @JsonProperty("email4")
    private String email4;
            @JsonProperty("email5")
    private String email5;
            @JsonProperty("refresh_token")
    private String refresh_token;
            @JsonProperty("refresh_expires_in")
    private String refresh_expires_in;
            @JsonProperty("sub")
    private String sub;
            @JsonProperty("access_token")
    private String access_token;
    private Date createdAt = new Date();
    private Date updatedAt;
    private boolean processed;

    public UserConcurAmxRequestDTO(String id, String firstName, String middleName, String lastName, String loyaltyNumber, String status, String requestToken, String lastModified, String userId, String uri, String email1, String email2, String email3, String email4, String email5, String refresh_token, String refresh_expires_in, String sub, String access_token, Date createdAt, Date updatedAt, boolean processed) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.loyaltyNumber = loyaltyNumber;
        this.status = status;
        this.requestToken = requestToken;
        this.lastModified = lastModified;
        this.userId = userId;
        this.uri = uri;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.email4 = email4;
        this.email5 = email5;
        this.refresh_token = refresh_token;
        this.refresh_expires_in = refresh_expires_in;
        this.sub = sub;
        this.access_token = access_token;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "UserConcurAmx [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName
                + ", lastName=" + lastName + ", loyaltyNumber=" + loyaltyNumber + ", status=" + status
                + ", requestToken=" + requestToken + ", lastModified=" + lastModified + ", userId=" + userId + ", uri="
                + uri + ", email1=" + email1 + ", email2=" + email2 + ", email3=" + email3 + ", email4=" + email4
                + ", email5=" + email5 + ", refresh_token=" + refresh_token + ", refresh_expires_in="
                + refresh_expires_in + ", sub=" + sub + ", access_token=" + access_token + "]";
    }
}
