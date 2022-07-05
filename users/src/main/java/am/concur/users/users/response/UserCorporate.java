package am.concur.users.users.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserCorporate {
    @JsonProperty("companys")
    private List<Companys> userCorporates;

    public List<Companys> getUserCorporates() {
        return userCorporates;
    }

    public void setUserCorporates(List<Companys> userCorporates) {
        this.userCorporates = userCorporates;
    }
}
