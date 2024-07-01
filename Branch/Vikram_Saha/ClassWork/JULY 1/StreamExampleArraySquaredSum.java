import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExampleArraySquaredSum {
    public static void main(String[] args) {
        List l = Arrays.asList(1, 2, 3, 5);
        IntStream mapToInt = l.stream().mapToInt(n -> (int) n);
        System.out.println(l.stream().filter(n -> (int) n % 2 == 0).map(n -> (int) n * (int) n)
                .reduce((a, b) -> (int) a + (int) b).orElse("0"));
        System.out.println(l.stream().mapToInt(n -> (int) n).filter(n -> n % 2 == 0).map(n -> n * n)
                .reduce(0,(a, b) -> (a * b)));
    }
}
