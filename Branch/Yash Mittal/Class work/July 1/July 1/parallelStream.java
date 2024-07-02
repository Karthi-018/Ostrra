import java.util.ArrayList;
import java.util.List;

public class parallelStream {
public static void main(String[] args) {
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<1000000;i++) li.add(i);

    long a1=System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    li.stream().map(a->{
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return a*a;
    });
    System.out.println(System.currentTimeMillis()-a1);
    
    a1=System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    li.parallelStream().map(a->{
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return a*a;
    });
    System.out.println(System.currentTimeMillis()-a1);

}
}