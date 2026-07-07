package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Logger object
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    // GET API: http://localhost:8083/hello
    @GetMapping("/hello")
    public String sayHello() {

        LOGGER.info("START - sayHello()");

        String message = "Hello World!!";

        LOGGER.info("END - sayHello()");

        return message;
    }

}