// PaymentServiceApplication.java
package com.example.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}


/*
run as java
in postman GET 	http://localhost:8082/payment
Payment Successful
*/
//	http://localhost:9411  zipkin run query