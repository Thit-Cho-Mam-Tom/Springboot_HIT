package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Thanh toán thẻ ứng dụng...");
    }
}
