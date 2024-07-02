package edu.osttra.training.Multithreading;

public class Demo {
    int count = 0;

     synchronized void increment() {
        count++;
    }
}
