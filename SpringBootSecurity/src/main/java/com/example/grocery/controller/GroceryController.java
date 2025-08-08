package com.example.grocery.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to the Grocery Store! This is a public endpoint.";
    }

    @GetMapping("/items")
    public List<String> getItems() {
        return List.of("Apples", "Bread", "Milk", "Eggs");
    }

    @GetMapping("/orders")
    public List<String> getOrders() {
        return List.of("Order #101", "Order #102", "Order #103");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnlyEndpoint() {
        return "Admin Access: You are viewing admin-only data.";
    }
}
