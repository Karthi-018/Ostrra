public class T2 implements Runnable{
    Demo1 d = new Demo1();
//public class T2 extends Thread{
    @Override
    public void run()
    {
        try {
            for(int i =0;i<100;i++){
                Demo1.increment();
                System.out.println("World");
                Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println("World");
        }
    }
    
}
