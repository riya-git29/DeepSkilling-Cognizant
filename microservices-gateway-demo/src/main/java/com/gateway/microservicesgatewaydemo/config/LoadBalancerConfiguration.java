package com.gateway.microservicesgatewaydemo.config;

import org.springframework.cloud.client.ServiceInstance;

import org.springframework.cloud.loadbalancer.core.*;

import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.env.Environment;

@Configuration
public class LoadBalancerConfiguration {

    @Bean
    public ReactorLoadBalancer<ServiceInstance>
    randomLoadBalancer(
            Environment environment,
            LoadBalancerClientFactory factory) {

        String serviceId =
                environment.getProperty(
                        LoadBalancerClientFactory.PROPERTY_NAME);

        return new RandomLoadBalancer(
                factory.getLazyProvider(
                        serviceId,
                        ServiceInstanceListSupplier.class),
                serviceId);
    }
}