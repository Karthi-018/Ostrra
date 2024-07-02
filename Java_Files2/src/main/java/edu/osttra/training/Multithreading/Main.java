package edu.osttra.training.Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//      for Thread class extend
//        T1 t1 = new T1();
//        T2 t2 = new T2();
//        t1.start();
//        t2.start();

//        for Runnable interface
//        Demo d = new Demo();
//        Thread t1 = new Thread(new T1(d));
//        Thread t2 = new Thread(new T2(d));
//        t1.start();
//        t2.start();
//        while(t1.isAlive() && t2.isAlive()) {}


        Demo d = new Demo();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    d.increment();
                }
            }
        };

        Runnable r2 = ()-> {for(int i = 0; i < 1000; i++)d.increment();};

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(()->{for(int i = 0; i < 1000; i++)d.increment();});

        t1.setDaemon(true);


        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.isDaemon());


        t1.join();
        t2.join();
        t3.join();

        System.out.println(d.count);
    }
}
