package com.gateway.microservicesgatewaydemo.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/service")
    @CircuitBreaker(
            name = "userCircuitBreaker",
            fallbackMethod = "fallbackResponse")
    public String service() {

        throw new RuntimeException(
                "Service Down");
    }

    public String fallbackResponse(
            Exception ex) {

        return "Fallback Response";
    }
}