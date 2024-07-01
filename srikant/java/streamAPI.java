import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,12,15,18,14,21,19,5,3,8);

        Stream<Integer> st = nums.stream();
        Stream<Integer> st2 = st.filter(n -> n%2 == 0);
        Stream<Integer> st3 = st2.map(n -> n*n);

        
        int res1 = st3.reduce(0, (a,b)-> a+b);
        //int res = st3.mapToInt(n->Integer.parseInt(n.toString())).sum();
        
        int res2 = nums.stream().filter(n->n%2==0).map(n->n*n).mapToInt(n->(int)n).sum();

        System.out.println(res1);
    }
}