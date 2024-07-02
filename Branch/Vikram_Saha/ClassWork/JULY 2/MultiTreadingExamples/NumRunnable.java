package MultiTreadingExamples;

public class NumRunnable implements Runnable {
    int j=0;
    synchronized void inc(){
        j++;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++) inc();
        // System.out.println(j);
    }

}
