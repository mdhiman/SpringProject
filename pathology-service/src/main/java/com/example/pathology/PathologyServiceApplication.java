package com.example.pathology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PathologyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathologyServiceApplication.class, args);
	}

}
