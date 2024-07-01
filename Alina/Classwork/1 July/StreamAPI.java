import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI
{
public static void main(String[] args) {
    List<Integer> numbers=Arrays.asList(2,3,5,6,9,7,10,1,12);
    Stream<Integer> s1=numbers.stream();
Stream<Integer> s2= s1.filter(n ->n%2==0);
Stream<Integer> s3=s2.map(n -> n*n);
int res = s3.mapToInt(n -> Integer.parseInt(n.toString())).sum();
//int result= s3.reduce(0,(n1,n2)-> n1+n2);
//System.out.println(result);
//System.err.println(res);
int result= numbers.stream()
.filter(n ->n%2==0)
.map(n-> n*n)
.mapToInt(n ->(int)n)
.sum();
System.out.println(result);
}
}