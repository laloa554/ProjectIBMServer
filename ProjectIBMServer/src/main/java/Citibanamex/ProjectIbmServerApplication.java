package Citibanamex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProjectIbmServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectIbmServerApplication.class, args);
	}

}
