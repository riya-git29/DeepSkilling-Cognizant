package com.example.paymentservice.config;

import io.github.resilience4j.circuitbreaker.*;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class ResilienceConfig {

    private final CircuitBreakerRegistry registry;

    public ResilienceConfig(
            CircuitBreakerRegistry registry) {

        this.registry = registry;
    }

    @PostConstruct
    public void monitor() {

        CircuitBreaker circuitBreaker =
                registry.circuitBreaker(
                        "paymentCircuitBreaker");

        circuitBreaker
                .getEventPublisher()
                .onStateTransition(event ->
                        System.out.println(
                                "State Changed : "
                                        + event.getStateTransition()));
    }
}