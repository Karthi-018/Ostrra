package edu.osttra.training.Multithreading;

public class T1 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
//                System.out.println("Hi");
//                Demo.increment();
                Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
