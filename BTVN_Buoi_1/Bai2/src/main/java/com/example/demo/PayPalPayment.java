package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("thanh toán qua payPal...");
    }
}
