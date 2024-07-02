public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        Demo1 d= new Demo1();
        Runnable r1= new Runnable() {
          @Override
          public void run()
          {
            for(int i=0;i<1000;i++)
            d.increment();
          }
        }; 
        Runnable r2=()-> {for(int i=0;i<1000;i++)d.increment();};
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(()->{for(int i=0;i<1000;i++)d.increment();});
        t1.setDaemon(true);  // Declare before starting
        System.out.println(t1.isDaemon());
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t1.setPriority(1);
        t1.setName("My Thread");
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(t3.getPriority());
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t3.isAlive());
    }
}
