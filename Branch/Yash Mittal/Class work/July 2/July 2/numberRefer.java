
import java.util.*;

public class numberRefer {
    public static void main(String[] args) {
        
    
    List<Integer> nums =  Arrays.asList(1,2,3,4);
    List<Number> n = new ArrayList<>();
    n=nums.stream().map(Number::new).toList();
    n.forEach(System.out::println);
    
}}
