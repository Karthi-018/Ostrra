package edu.osttra.training.Multithreading;

public class T2 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello");
//                Demo.increment();
                Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
