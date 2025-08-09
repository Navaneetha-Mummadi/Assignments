package com.example.app.controller;

import com.example.app.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/check-delivery")
    public String checkDeliveryStatus() {
        return deliveryService.getDeliveryStatus();
    }
}
