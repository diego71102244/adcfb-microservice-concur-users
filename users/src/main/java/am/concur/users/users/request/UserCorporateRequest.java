package am.concur.users.users.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCorporateRequest {
    @JsonProperty("loyalty_number")
    private String loyaltyNumber;

    @JsonProperty("last_name")
    private String lastName;

    public UserCorporateRequest(){
        super();
    }

    public UserCorporateRequest(String loyaltyNumber, String lastName) {
        this.loyaltyNumber = loyaltyNumber;
        this.lastName = lastName;
    }

    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    public void setLoyaltyNumber(String loyaltyNumber) {
        this.loyaltyNumber = loyaltyNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
