package com.example.paymentservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    PaymentService.class);

    @CircuitBreaker(
            name = "paymentCircuitBreaker",
            fallbackMethod = "fallbackPayment")
    public String processPayment() {

        logger.info(
                "Calling Third Party Payment API");

        throw new RuntimeException(
                "Third Party API Down");
    }

    public String fallbackPayment(
            Exception ex) {

        logger.error(
                "Fallback Executed : {}",
                ex.getMessage());

        return "Payment Service Temporarily Unavailable";
    }
}