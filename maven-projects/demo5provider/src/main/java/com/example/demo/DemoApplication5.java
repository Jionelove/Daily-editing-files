package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
@SpringBootApplication
@RestController
public class DemoApplication5 implements GreetingController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication5.class, args);
    }

    @Override
    public String greeting() {
        return String.format(
          "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}