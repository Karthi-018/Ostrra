package Method_Reference;

import java.util.*;

class Nums{
    int i;
    Nums(int i){
        this.i=i;
    }
    public String toString(){
        return " Nums{ i = " + i + "}";
    }
}

public class Meth {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Nums> n = new ArrayList<>();
        n = nums.stream().map(Nums::new).toList();
        n = n.stream().map(n1->new Nums(n1.i*n1.i)).toList();

        n.forEach(System.out::println);
        // nums.forEach(System.out::println);
    }
    
}