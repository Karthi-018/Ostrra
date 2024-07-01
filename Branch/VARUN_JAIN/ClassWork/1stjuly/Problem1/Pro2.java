package Problem1;

import java.util.*;
import java.util.Random;

public class Pro2 {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<10000;i++){
            nums.add(r.nextInt(100));
        }
        long startnormal = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        nums.stream().map(n->{try{
            Thread.sleep(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    return n*n;}).mapToInt(i->i).sum();
    long endnormal = System.currentTimeMillis();
    // System.out.println(endnormal);
    System.out.println("Normal "+(endnormal-startnormal));

    long startparallel = System.currentTimeMillis();
        // System.out.println(System.currentTimeMillis());
        nums.parallelStream().map(n->{try{
            Thread.sleep(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    return n*n;}).mapToInt(i->i).sum();
    long endparallel = System.currentTimeMillis();
    // System.out.println(endparallel);
    System.out.println("Parallel "+(endparallel-startparallel));


    }
    

}
