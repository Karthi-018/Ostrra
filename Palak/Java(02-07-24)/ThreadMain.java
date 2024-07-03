public class ThreadMain {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Done");
        Demo1 d = new Demo1();
        Runnable r1 = new Runnable() {
            @Override
           
            public void run(){
                for(int i =0;i<1000;i++)d.increment();
            }
        };
        Runnable r2 = ()->{for(int i=0;i<1000;i++)d.increment();};

        // T1 t1 = new T1();
        // T2 t2 = new T2();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        t3.start();
        t4.start();
        // while(t3.isAlive()||t4.isAlive()){

        // }
        t3.join();
        t4.join();
       

        System.out.println(Demo1.count);
    }
    
}
