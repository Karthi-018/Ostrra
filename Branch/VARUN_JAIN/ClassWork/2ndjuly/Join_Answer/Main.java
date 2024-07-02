package Join_Answer;


public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
        Tdemo d1 = new Tdemo();
    Runnable r1 = new Runnable() {
    public void run(){
        for(int i=0;i<10000;i++) d1.incr();
    }
    };

    Runnable r2 =()->{for(int i=0;i<10000;i++)d1.incr();};

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    Thread t3 = new Thread(()->{for(int i=0;i<10000;i++)d1.incr();});
    t1.start();
    t2.start();
    t3.start();
    t1.join();
    t2.join();
    System.out.println(d1.count);
    
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t3.getPriority());

    }








}
