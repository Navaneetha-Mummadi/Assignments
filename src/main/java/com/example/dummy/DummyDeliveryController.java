package com.example.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyDeliveryController {

    @GetMapping("/delivery/status")
    public String getStatus() {
        return "Delivery is on the way!";
    }
}
