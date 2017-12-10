package flowers.launch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import flowers.launch.repositories.UserRepository;

@SpringBootApplication
public class FlowersAppApplication extends WebMvcConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(FlowersAppApplication.class, args);
    }
}