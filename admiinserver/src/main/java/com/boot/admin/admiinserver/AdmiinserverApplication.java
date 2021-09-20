	package com.boot.admin.admiinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdmiinserverApplication {

	public static void main(String[] args) {
		System.out.println("Just code check");
		SpringApplication.run(AdmiinserverApplication.class, args);
	}

}
