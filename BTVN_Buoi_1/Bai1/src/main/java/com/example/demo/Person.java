package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Vehicle vehicle;
    private Engine engine;
    @Autowired
    public Person(@Qualifier("car") Vehicle vehicle, @Qualifier("electricEngine") Engine engine) {
        this.vehicle = vehicle;
        this.engine = engine;
    }
public void travel(){
       vehicle.move();
       engine.drive();
}
}
