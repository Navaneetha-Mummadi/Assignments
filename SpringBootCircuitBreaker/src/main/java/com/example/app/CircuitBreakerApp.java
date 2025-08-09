package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircuitBreakerApp {
    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerApp.class, args);
    }
}

/*
 run dummy program and get output ->don't stop 8081 
 now run 8080 circuit
//GET http://localhost:8080/api/check-delivery
Delivery is on the way!
stop 8080
stop 8081
start 8080-> GET http://localhost:8080/api/check-delivery

Delivery status service is currently unavailable. Please try again later.



*/