package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface pedt {
	@GetMapping("/1")
	String getD();
	@GetMapping("/2")
	String getP();
}
