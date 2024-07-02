package MultiTreadingExamples;

import java.util.concurrent.Semaphore;

public class GenerateNumMain {
public static void main(String[] args) {
    // f1();
    // Thread t1= new Thread(()->System.out.println("hi"));
    // t1.start();
    f2();
    

}
public static void f2(){
    NumRunnable n=new NumRunnable();
    Thread t1=new Thread(n);
    Thread t2=new Thread(n);
    t1.start();
    t2.start();
    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println(n.j);
}
public static  void f1(){
    GenerateNum n1=new GenerateNum("num 1");
    GenerateNum n2=new GenerateNum("num 2");
    n1.start();
    n2.start();

    while(n1.getState()!=Thread.State.TERMINATED || n2.getState()!=Thread.State.TERMINATED ){
        
    }
    System.out.println("done");

}
}
