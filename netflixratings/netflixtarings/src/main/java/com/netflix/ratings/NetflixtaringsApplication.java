package com.netflix.ratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixtaringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixtaringsApplication.class, args);
	}

}
