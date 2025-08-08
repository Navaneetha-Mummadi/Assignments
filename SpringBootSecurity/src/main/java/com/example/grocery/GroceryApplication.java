package com.example.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryApplication {
    public static void main(String[] args) {
        SpringApplication.run(GroceryApplication.class, args);
    }
}
// NoAuthuni GET http://localhost:8080/grocery/public
/*
 
With Basic Auth:---------
Username: user
Password: user123
GET http://localhost:8080/grocery/items
GET http://localhost:8080/grocery/orders

Admin Only:
	Username: admin
	Password: admin123
	GET http://localhost:8080/grocery/admin
*/