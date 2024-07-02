public class ThreadMainDemo {

    public static void main(String[] args) throws InterruptedException{
        ThreadClassDemo t = new ThreadClassDemo();
        Runnable r = new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i<1000; i++)t.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(()->{for(int i=0;i<1000;i++)t.increment();});

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t.num);
    }
}