package com.netflix.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CommentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentsApplication.class, args);
	}
	
	//@LoadBalanced
	/*@Bean
	public RestTemplate getRestTempalte() {
		return new RestTemplate();
	}*/

}
