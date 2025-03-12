package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FastFoodOrder implements Order {
    @Override
    public void playOder() {
        System.out.println("đặt món ăn nhanh...");
    }
}
