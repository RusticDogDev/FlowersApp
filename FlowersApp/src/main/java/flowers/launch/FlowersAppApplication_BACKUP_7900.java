package flowers.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

=======
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import flowers.launch.models.User;
>>>>>>> 9df22bfc50089201d257372b8854b748cc28b343
import flowers.launch.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
<<<<<<< HEAD
public class FlowersAppApplication extends WebMvcConfigurerAdapter {
		
=======
public class FlowersAppApplication implements CommandLineRunner {
	
>>>>>>> 9df22bfc50089201d257372b8854b748cc28b343
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlowersAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		userRepository.deleteAll();
		userRepository.save(new User((long) 1123432,"regular", "kieran2","guess"));

		
		System.out.println("Userss found with findAll():");
		System.out.println("-------------------------------");
		for (User user : userRepository.findAll()) {
			System.out.println(user);
		}
		System.out.println();
		
	}
	
}
