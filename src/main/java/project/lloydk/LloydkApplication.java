package project.lloydk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
public class LloydkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LloydkApplication.class, args);
	}

}
