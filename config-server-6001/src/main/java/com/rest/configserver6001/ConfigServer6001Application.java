package com.rest.configserver6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer6001Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer6001Application.class, args);
	}
}
