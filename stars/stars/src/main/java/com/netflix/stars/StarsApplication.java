package com.netflix.stars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StarsApplication {
	public static void main(String[] args) {
		SpringApplication.run(StarsApplication.class, args);
	}
}
