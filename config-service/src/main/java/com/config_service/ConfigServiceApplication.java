package com.config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	//en este proyecto solo en el pom es el dev tools y el config server de cloud
	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
