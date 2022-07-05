package am.concur.users.users;

import am.concur.users.users.repository.UserConcurRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableFeignClients(basePackages = {"am.concur.users.users"})
public class UsersApplication {

	public static void main(String[] args) {
		String s = new String();
		System.out.println(s.isBlank());
		SpringApplication.run(UsersApplication.class, args);
	}

}
