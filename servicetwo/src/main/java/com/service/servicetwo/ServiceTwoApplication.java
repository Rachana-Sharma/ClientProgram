package com.service.servicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.service")
public class ServiceTwoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApplication.class, args);
	}

}
