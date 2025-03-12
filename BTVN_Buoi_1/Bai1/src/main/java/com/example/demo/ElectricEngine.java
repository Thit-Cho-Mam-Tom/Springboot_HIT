package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    @Override
    public void drive() {
        System.out.println("Electric!!!");
    }
}
