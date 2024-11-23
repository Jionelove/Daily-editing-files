package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class DemoApplication93 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication93.class, args);
	}

}
