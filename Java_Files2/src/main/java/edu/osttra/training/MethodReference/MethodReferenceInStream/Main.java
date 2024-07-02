package edu.osttra.training.MethodReference.MethodReferenceInStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> n = new ArrayList<>();

//        nums.forEach(nn-> System.out.println(nn+" "));
//        nums.forEach(System.out::println);

        n = nums.stream().map(Number::new).toList();
        

        n = n.stream().map(n1-> new Number(n1.i*n1.i)).toList();

        n.forEach(System.out::println);
    }
}
