package com.example.provide02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provide02Application {

    public static void main(String[] args) {
        SpringApplication.run(Provide02Application.class, args);
    }

}
