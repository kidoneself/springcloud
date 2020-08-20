package com.example.provide01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provide01Application {

    public static void main(String[] args) {
        SpringApplication.run(Provide01Application.class, args);
    }

}
