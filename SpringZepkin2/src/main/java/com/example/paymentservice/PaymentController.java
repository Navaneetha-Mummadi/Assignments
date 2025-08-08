// PaymentController.java
package com.example.paymentservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @GetMapping("/payment")
    public String makePayment() {
        return "Payment Successful";
    }
}
