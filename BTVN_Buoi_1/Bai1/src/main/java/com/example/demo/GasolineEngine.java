package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine{


    @Override
    public void drive() {
        System.out.println("Gasoline!!!");
    }
}
