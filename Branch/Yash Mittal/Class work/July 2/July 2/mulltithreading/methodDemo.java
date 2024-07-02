package mulltithreading;

class T1 implements Runnable{
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Hi");
              //  Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class T2 extends Thread{
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Hello");
               // Thread.sleep(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class methodDemo {
    
    static int count=0;
    static void increment(){
       
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
       // T1 t1= new T1();
        Thread t3 = new Thread(new T1());
        T2 t2 = new T2();
        
        t3.setPriority(10);
        t2.setPriority(1);
        t3.start();
        t2.start();
        System.out.println(t3.getPriority());
         
        // try{
        //     t3.join();
        //     t2.join();
        // }catch(InterruptedException e){
        //         System.out.println("Main thread was interrupted while waiting for threads to complete.");
        // }
        //     increment();
            
         }
    }
    

