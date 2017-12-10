package flowers.launch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import flowers.launch.models.User;
=======
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

>>>>>>> 74ddf33215abfb9f5909e4472d6d173521cf55a0
import flowers.launch.repositories.UserRepository;

<<<<<<< HEAD
@SpringBootApplication//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class FlowersAppApplication implements CommandLineRunner {
	
=======
@SpringBootApplication
public class FlowersAppApplication extends WebMvcConfigurerAdapter {
		
>>>>>>> 74ddf33215abfb9f5909e4472d6d173521cf55a0
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlowersAppApplication.class, args);
	}	
}
