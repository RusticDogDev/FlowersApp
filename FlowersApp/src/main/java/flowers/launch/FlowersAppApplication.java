package flowers.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@Controller
public class FlowersAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowersAppApplication.class, args);
	}
	
}
