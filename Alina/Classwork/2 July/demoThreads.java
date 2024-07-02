import java.lang.*;
class T1 extends Thread{
public void run()
{
  for(int i=0;i<10;i++)
  {
    System.out.println("Hi");
  }
}
}
class T2 extends Thread{
    @Override
    public void run()
    {
      for(int i=0;i<10;i++)
      {
        System.out.println("World");
      }
    }
    }
    class T3 extends Thread{
        @Override
        public void run()
        {
            try{
          for(int i=0;i<10;i++)
          {
            System.out.println("hi");
            Thread.sleep(2);
          }
        }
          catch (Exception e){
            System.out.println(e.getMessage());
          }
        }
        }
        class T4 implements Runnable{
            @Override
            public void run()
            {
                try{
              for(int i=0;i<10;i++)
              {
                System.out.println("Demo");
                Thread.sleep(2);
              }
            }
              catch (Exception e){
                System.out.println(e.getMessage());
              }
            }
            }

public class demoThreads {
    public static void main(String[] args) {
        T1 t1=new T1();
        T2 t2=new T2();
        T3 t3=new T3();
        T4 t4 = new T4();
        t1.start();
        t2.start();
        t3.start();
        Thread t5= new Thread(t4);
        t5.start();
    }
}
