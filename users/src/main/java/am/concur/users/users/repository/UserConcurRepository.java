package am.concur.users.users.repository;

import am.concur.users.users.request.UserAmexDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConcurRepository extends MongoRepository<UserAmexDAO, String> {

    public UserAmexDAO findByLastNameAndLoyaltyNumber(String lastname, String loyaltyNumber);

}
