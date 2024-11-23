package com.example.demo2.controller;

import org.springframework.web.multipart.MultipartFile;

public class ConfigruableBean {
	String yardage;
	String clothes;
	MultipartFile file;
	public String getClothes() {
		return clothes;
	}
	public void setClothes(String clothes) {
		this.clothes = clothes;
	}
	public String getYardage() {
		return yardage;
	}
	public void setYardage(String yardage) {
		this.yardage = yardage;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
