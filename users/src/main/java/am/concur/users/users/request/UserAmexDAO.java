package am.concur.users.users.request;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Getter
@Setter
@Document(value = "concur_users")
public class UserAmexDAO {

    public UserAmexDAO(){

    }

    public UserAmexDAO(String id, String _id, String firstName, String middleName, String lastName, String loyaltyNumber, String status, String requestToken, String lastModified, String userId, String uri, String email1, String email2, String email3, String email4, String email5, String refresh_token, String refresh_expires_in, String sub, String access_token, String geolocation, Date createdAt, Date updatedAt) {
        this.id = id;
        this._id = _id;
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
        this.geolocation = geolocation;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Id
    private String id;
    @Field("id_user")
    private String _id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String loyaltyNumber;
    private String status;
    private String requestToken;
    private String lastModified;
    private String userId;
    @Field("URI")
    private String uri;
    private String email1;
    private String email2;
    private String email3;
    private String email4;
    private String email5;
    private String refresh_token;
    private String refresh_expires_in;
    private String sub;
    private String access_token;
    private String geolocation;
    private Date createdAt = new Date();
    private Date updatedAt;


    @Override
    public String toString() {
        return "UserAmexRequest{" +
                "id='" + id + '\'' +
                ", _id='" + _id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", loyaltyNumber='" + loyaltyNumber + '\'' +
                ", status='" + status + '\'' +
                ", requestToken='" + requestToken + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", userId='" + userId + '\'' +
                ", uri='" + uri + '\'' +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                ", email3='" + email3 + '\'' +
                ", email4='" + email4 + '\'' +
                ", email5='" + email5 + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", refresh_expires_in='" + refresh_expires_in + '\'' +
                ", sub='" + sub + '\'' +
                ", access_token='" + access_token + '\'' +
                ", geolocation='" + geolocation + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
