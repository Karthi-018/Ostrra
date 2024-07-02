public class Demo {
    static int count=0;

    public Demo() {
    }
    
    static void increment()
    {
        count++;
    }
}
// class T1 implements Runnable{
//     Demo d= new Demo();
//     @Override
//     public void run()
// {
//     try {
//         for (int i = 1; i < 100; i++) {
//             Demo.increment();
//             Thread.sleep(2);
//         }
//     } catch (Exception e) {
//         System.out.println(e.getMessage());
//     }
// }
// class T2 implements Runnable{
//     Demo d= new Demo();
//     @Override
//     public void run()
// {
//     try {
//         for (int i = 1; i < 100; i++) {
//             Demo.increment();
//             Thread.sleep(2);
//         }
//     } catch (Exception e) {
//         System.out.println(e.getMessage());
//     }
// }
// }

