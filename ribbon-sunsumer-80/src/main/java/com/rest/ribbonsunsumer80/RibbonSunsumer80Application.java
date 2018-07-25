package com.rest.ribbonsunsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RibbonSunsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonSunsumer80Application.class, args);
	}
}
