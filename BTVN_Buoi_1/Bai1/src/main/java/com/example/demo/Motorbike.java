package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle {

    @Override
    public void move() {
        System.out.println("Motorbike!!!");
    }
}
