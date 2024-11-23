package com.example.demo2.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
public class SaveLevelUpFile{
	//编写Controller方法
	@GetMapping("/download")
	public void downloadFile(HttpServletResponse response) {
	    try {
	        //获取要下载的文件
	        File file = new File("file_path");

	        //设置响应的内容类型为二进制流，即文件类型
	        response.setContentType("application/octet-stream");

	        //设置文件名
	        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(file.getName(), "UTF-8"));

	        //创建输入流
	        FileInputStream inputStream = new FileInputStream(file);
	        BufferedInputStream buffInputStream = new BufferedInputStream(inputStream);

	        //创建输出流
	        ServletOutputStream outputStream = response.getOutputStream();
	        BufferedOutputStream buffOutputStream = new BufferedOutputStream(outputStream);

	        //循环读取数据并写入到响应输出流中
	        byte[] buffer = new byte[1024];
	        int len = -1;
	        while ((len = buffInputStream.read(buffer)) != -1) {
	            buffOutputStream.write(buffer, 0, len);
	        }

	        //关闭流
	        buffOutputStream.flush();
	        buffOutputStream.close();
	        outputStream.flush();
	        outputStream.close();
	        buffInputStream.close();
	        inputStream.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}