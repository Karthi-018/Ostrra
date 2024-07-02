package Problem2;

public class T1 implements Runnable {
    Demo d =new Demo();
    public void run(){
        try {
            for(int i=0;i<=100;i++){
                Demo.incr();
                Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

