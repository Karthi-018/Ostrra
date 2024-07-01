import java.util.ArrayList;
import java.util.List;

public class parallelStream {
public static void main(String[] args) {
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<10000;i++) li.add(i);

    long a1=System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    li.stream().map(a->{
        
        return a*a;
    });
    System.out.println(System.currentTimeMillis()-a1);
    
    a1=System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    li.parallelStream().map(a->{
        
        return a*a;
    });
    System.out.println(System.currentTimeMillis()-a1);

}
}
