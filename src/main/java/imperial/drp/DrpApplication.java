package imperial.drp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DrpApplication {

	private static final Logger log = LoggerFactory.getLogger(DrpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DrpApplication.class);
	}


}