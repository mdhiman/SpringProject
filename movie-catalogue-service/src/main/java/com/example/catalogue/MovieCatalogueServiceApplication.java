package com.example.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MovieCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueServiceApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate  getRestTemplate() {
		return new RestTemplate();
	}

}
