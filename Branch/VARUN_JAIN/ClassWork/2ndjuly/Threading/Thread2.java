package Threading;


class T1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hi" + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
class T2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}

public class Thread2 {
    
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);

        t3.start();
        t4.start();
        
    }
}

