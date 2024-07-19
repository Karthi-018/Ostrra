package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class pacman {
    public void up(){
        System.out.println("jump");
    }

    public void down() {
        System.out.println("down");    }

    public void left() {
        System.out.println("left");    }
}
