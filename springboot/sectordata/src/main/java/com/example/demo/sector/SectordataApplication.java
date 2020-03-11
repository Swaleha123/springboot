package com.example.demo.sector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SectordataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SectordataApplication.class, args);
	}

}
