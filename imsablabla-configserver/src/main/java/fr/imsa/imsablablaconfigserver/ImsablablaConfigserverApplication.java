package fr.imsa.imsablablaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ImsablablaConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsablablaConfigserverApplication.class, args);
	}

}
