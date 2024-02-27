package com.Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Spring.services.RazorpayService;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaymentController {

    @Autowired
    private RazorpayService razorpayService;

    @GetMapping("/order/{amount}")
    @CrossOrigin(origins="http:/localhost:4200/")
    public String createOrder(@PathVariable("amount") int amount) {
        try {
            // Create an order in Razorpay and return the order details
            return razorpayService.createOrder(amount);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
