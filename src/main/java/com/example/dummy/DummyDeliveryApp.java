package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyDeliveryApp {
    public static void main(String[] args) {
        SpringApplication.run(DummyDeliveryApp.class, args);
    }
}
/*
 * for circuit breaker
 
set server 8091
> run as java appl
>http://localhost:8081/delivery/status in postman
Delivery is on the way!
*/