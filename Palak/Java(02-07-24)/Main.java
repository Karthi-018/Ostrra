
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Number> n = new ArrayList<>();
        
        n=nums.stream().map(Number::new).toList();
        n.forEach(System.out::println);
    }
}
