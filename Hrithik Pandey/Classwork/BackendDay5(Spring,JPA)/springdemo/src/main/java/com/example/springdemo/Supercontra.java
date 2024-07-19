package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Supercontra {
    public void up(){
        System.out.println("Fly");
    }

    public void down() {
        System.out.println("fall");    
    }

    public void left() {
        System.out.println("shoot");  
    }
}
