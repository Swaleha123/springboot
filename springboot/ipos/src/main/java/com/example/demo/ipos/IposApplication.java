package com.example.demo.ipos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class IposApplication {

	public static void main(String[] args) {
		SpringApplication.run(IposApplication.class, args);
	}

}
