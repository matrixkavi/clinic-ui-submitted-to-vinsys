package com.example.clinicserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ClinitEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinitEurekaServerApplication.class, args);
	}

}
