package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.netflix.discovery.EurekaClient;
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class DemoApplication8 {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication8.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
        		.route("path_route", r -> r.path("/csdn/**").uri("https://blog.csdn.net"))
        		.route("gateway", r->r.path("/demo","/1","/2").uri("lb://PERSON-GATEWAY.COM/person-gateway.com"))
        		.route(r->r.path("/").uri("lb://CRAYYGE81.COM/crayyge81.com"))
        		.build();
    }
    
}
