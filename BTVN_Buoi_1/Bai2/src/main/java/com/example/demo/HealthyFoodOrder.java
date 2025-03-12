package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HealthyFoodOrder implements Order {
    @Override
    public void playOder() {
        System.out.println("đặt món ăn lành mạnh...");
    }
}
