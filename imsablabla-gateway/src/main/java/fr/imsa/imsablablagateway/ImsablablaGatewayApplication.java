package fr.imsa.imsablablagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ImsablablaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsablablaGatewayApplication.class, args);
	}

}
