package com.authdemo.centralizedauthenticationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentralizedAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                CentralizedAuthApplication.class,
                args);
    }
}