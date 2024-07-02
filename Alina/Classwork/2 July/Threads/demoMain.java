public class demoMain {
    public static void main(String[] args) {
        T1 t1=new T1();
        T2 t2= new T2();
        Thread t3= new Thread(t1);
        Thread t4= new Thread(t2);
        t3.start();
        t4.start();
        while (t3.isAlive()|| t4.isAlive())
        {

        }
        System.out.println("Finish");
    }
}
