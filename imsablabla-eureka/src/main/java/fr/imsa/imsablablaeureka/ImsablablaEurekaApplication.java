package fr.imsa.imsablablaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImsablablaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsablablaEurekaApplication.class, args);
	}

}
