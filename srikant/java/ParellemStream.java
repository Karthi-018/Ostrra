import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParellemStream {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<10000; i++)
            list.add(r.nextInt(100));

        long startNormalStream = System.currentTimeMillis();
        System.out.println(startNormalStream);

        list.stream().map(n-> {try{
            Thread.sleep(1);
        }
        catch(InterruptedException e){System.out.println(e.getMessage());} return n*n;
        }).mapToInt(i->i).sum();

        long endNormalStream = System.currentTimeMillis();
        System.out.println(endNormalStream);

        System.out.println("Normal stream time taken - " + (endNormalStream - startNormalStream));




        long startParellelStream = System.currentTimeMillis();
        System.out.println(startParellelStream);

        list.parallelStream().map(n-> {try{
            Thread.sleep(1);
        }
        catch(InterruptedException e){System.out.println(e.getMessage());} return n*n;
        }).mapToInt(i->i).sum();

        long endParellelStream = System.currentTimeMillis();
        System.out.println(endParellelStream);

        System.out.println("Normal stream time taken - " + (endParellelStream - startParellelStream));
        
    }
}