import java.util.Arrays;
import java.util.List;

public class MethodReference{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        List<numbers> nums = l.stream().map(numbers::new).toList();
        nums.forEach(System.out::print);

        nums = nums.stream().map(n1 -> new numbers(n1.i * n1.i)).toList();
        nums.forEach(System.out::print);
    }
}

class numbers {
    int i;

    public numbers(int i){
        this.i = i;
    }

    @Override
    public String toString(){
        return i + " ";
    }
    
}