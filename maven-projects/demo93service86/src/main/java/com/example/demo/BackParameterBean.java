package com.example.demo;

import org.springframework.web.multipart.MultipartFile;

public class BackParameterBean {
	MultipartFile data;
	String yardage;
	String clothes;
	public String getYardage() {
		return yardage;
	}
	public void setYardage(String yardage) {
		this.yardage = yardage;
	}
	public String getClothes() {
		return clothes;
	}
	public void setClothes(String clothes) {
		this.clothes = clothes;
	}
	public MultipartFile getData() {
		return data;
	}
	public void setData(MultipartFile data) {
		this.data = data;
	}
	
}
