package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication   //instead of above 3 annotation we can use only thid one annotation

public class SpringprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectsApplication.class, args);
		System.out.println("My Spring application using  sts");

	}

}
