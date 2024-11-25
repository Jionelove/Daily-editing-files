package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.websocket.server.PathParam;

@RestController
public class ShoppingBackstage {
	@PostMapping("/backstage")
	private String backstage(@PathParam("data")MultipartFile data,@PathParam("yardage")String yardage,@PathParam("clothes")String clothes) throws IOException {
		
		if(data.isEmpty()) {
			return "nothing";
		}
		byte[] by=data.getBytes();
		String catalogue="E:\\/data/";
		File file=new File(catalogue+data.getOriginalFilename());
		data.transferTo(file);
		return "lines";
	}
}
