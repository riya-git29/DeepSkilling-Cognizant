package com.gateway.microservicesgatewaydemo.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import io.github.resilience4j.timelimiter.TimeLimiterConfig;

import org.springframework.cloud.circuitbreaker.resilience4j.*;

import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResilienceConfiguration {

    @Bean
    public Customizer<
                ReactiveResilience4JCircuitBreakerFactory>
    defaultCustomizer() {

        return factory ->
                factory.configureDefault(
                        id ->
                                new Resilience4JConfigBuilder(id)

                                        .circuitBreakerConfig(
                                                CircuitBreakerConfig.ofDefaults())

                                        .timeLimiterConfig(
                                                TimeLimiterConfig.ofDefaults())

                                        .build());
    }
}