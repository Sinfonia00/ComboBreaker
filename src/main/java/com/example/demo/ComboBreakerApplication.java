package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComboBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComboBreakerApplication.class, args);
		System.out.println("Web application on!");
		System.out.println("http://localhost:8080/");
	}

}
