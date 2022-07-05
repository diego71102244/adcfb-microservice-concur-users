package am.concur.users.users.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CorporateResponse {

    @JsonProperty("is_corporate")
    private boolean isCorporate;

    @JsonProperty("user_coporate")
    private UserCorporate userCorporates;

    public boolean isCorporate() {
        return isCorporate;
    }

    public void setCorporate(boolean corporate) {
        isCorporate = corporate;
    }

    public UserCorporate getUserCorporates() {
        return userCorporates;
    }

    public void setUserCorporates(UserCorporate userCorporates) {
        this.userCorporates = userCorporates;
    }
}
