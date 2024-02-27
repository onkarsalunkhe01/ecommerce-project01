package com.Spring.services;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RazorpayService {

    private RazorpayClient client;

    public RazorpayService() throws Exception {
        // Replace "key_id" and "key_secret" with your actual Razorpay credentials
        this.client = new RazorpayClient("rzp_test_CZiD7OvY679nK8", "m4XbfrFQbcXTlZqftwmDazvY");
    }

    // Method to create an order
    public String createOrder(int amount) throws Exception {
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amount * 100); // converting to the smallest currency unit
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", "txn_123456");
        orderRequest.put("payment_capture", true);

        // Creating Razorpay order
        Order order = client.orders.create(orderRequest);

        // You can return the entire Order object here as per your requirement
        return order.toString();
    }
}
