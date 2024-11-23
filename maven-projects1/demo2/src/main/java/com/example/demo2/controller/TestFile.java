package com.example.demo2.controller;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResizableByteArrayOutputStream;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestFile {
@PostMapping("/backstage")
public String filedata(ConfigruableBean ConfigruableBean) {
		System.out.println("鞋码："+ConfigruableBean.clothes+"衣服："+ConfigruableBean.clothes);
		try {
			InputStream input=ConfigruableBean.file.getInputStream();
			String fileName=ConfigruableBean.file.getOriginalFilename()+"{大小："+ConfigruableBean.file.getSize()+"}";
			byte[] by=new byte[1024];
			ByteArrayOutputStream out=new ByteArrayOutputStream(999999999);
			int length;float kb=0,power=0;
			while((length=input.read(by))!=-1) {
				out.write(by, 0, length);
				kb=length/1024;
				power+=kb;
				System.out.println("文件："+fileName+"---上传"+power+"kb…………");
				
			}
			System.err.println(fileName);
			//System.err.println(out.toString());
			//out.writeTo(new FileOutputStream(new File("")));
			return "已上传"+power+"kb";
				} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
}