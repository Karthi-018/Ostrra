
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,7,5,11,45,33,78,10);
        
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(System.out::println);
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        // s2.forEach(System.out::println);
        Stream<Integer> s3 = s2.map(n->{
            System.out.println(n*n);
            return n*n;});
        // int result = s3.reduce(0,(n1,n2) -> (n1+n2));
        int result = s3.mapToInt(n->n).sum();


        // int result = nums.stream()
        // .filter(n->n%2==0)
        // .map(n->n*n)
        // .mapToInt(n->(int)n)
        // .sum();
        

        System.out.println(result);

    }
    
}
