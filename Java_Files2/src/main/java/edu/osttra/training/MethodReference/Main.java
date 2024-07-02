package edu.osttra.training.MethodReference;

public class Main {
    public static void main(String[] args) {
        Demo d = DemoImp::print;
        d.display();
    }
}
