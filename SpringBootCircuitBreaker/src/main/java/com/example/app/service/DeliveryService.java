package com.example.app.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String DELIVERY_SERVICE = "deliveryService";

    @CircuitBreaker(name = DELIVERY_SERVICE, fallbackMethod = "getFallbackDeliveryStatus")
    public String getDeliveryStatus() {
        String url = "http://localhost:8081/delivery/status";
        return restTemplate.getForObject(url, String.class);
    }

    public String getFallbackDeliveryStatus(Throwable t) {
        return "Delivery status service is currently unavailable. Please try again later.";
    }
}
