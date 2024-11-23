package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public interface GreetingController {
	@GetMapping("/demo")
	String greeting();
}
