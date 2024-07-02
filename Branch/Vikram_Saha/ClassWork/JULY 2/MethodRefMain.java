import java.util.Arrays;
import java.util.List;

public class MethodRefMain {
public static void main(String[] args) {
    List li = Arrays.asList(1,2,34,56,7,8,9);
    li.forEach(System.out::println);
    List li1=Arrays.asList(li.stream().toArray());
    li1.forEach(System.out::println);
    
    
}
}
