package com.rest.hystrix9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix9001Application {

	public static void main(String[] args) {
		SpringApplication.run(Hystrix9001Application.class, args);
	}
}
