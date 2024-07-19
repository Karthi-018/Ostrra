package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gr")
public class gamerunner {
    @Autowired
    private mario m;

    public void setMario(mario m) {
        this.m = m;
    }
    public void run(){
        m.up();
        m.down();
        m.left();
    }
}
