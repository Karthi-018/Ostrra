package edu.osttra.training.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 7, 12, 15, 14, 16, 17, 19, 20);
        List<String> names = Arrays.asList("Ankit", "Shiva", "Palak", "Karan");
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(s-> System.out.println(s));

        Stream<Integer> s2 = s1.filter(n->n%2==0);
        // s2.forEach(System.out::println);

        Stream<Integer> s3 = s2.map(n->n*n);
        // s3.forEach(System.out::println);

        // int result = s3.reduce(0, (n1, n2)-> n1+n2);
        // System.out.println(result);

        // int result = s3.mapToInt(n-> Integer.parseInt(n.toString())).sum();
        // System.out.println(result);

        //    Stream<Integer> s4 = s3.mapToInt();
        //    int result = s4.sum();

        int result = nums.stream().filter(n->n%2==0).map(n->n*n).mapToInt(n->(int)n).sum();
        System.out.println(result);

        //    Optional<String> str = names.stream().filter(name->name.contains("i")).findFirst();
        String str = names.stream().filter(name->name.contains("a")).findFirst().orElseThrow();
        System.out.println(str);

//       parallel stream
        String str0 = names.parallelStream().filter(name->name.contains("a")).findAny().orElse("Not found");
        System.out.println(str0);

        String str1 = names.parallelStream().filter(name->name.contains("a")).findFirst().orElse("Not found");
        System.out.println(str1);


//
        Random r = new Random();
        List<Integer> numss = new ArrayList<>();
        for(int i = 0; i < 10000; i++) {
            numss.add(r.nextInt(100));
        }
        long startNormalStream = System.currentTimeMillis();
        System.out.println(startNormalStream);

        numss.stream().map(n-> {
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return n*n;
        }).mapToInt(i->i).sum();
        long endNormalStream = System.currentTimeMillis();
        System.out.println(endNormalStream);
        System.out.println("Time taken to process Normal stream "+(endNormalStream-startNormalStream));


        long startParallelStream = System.currentTimeMillis();
        System.out.println(startNormalStream);

        numss.parallelStream().map(n-> {
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return n*n;
        }).mapToInt(i->i).sum();
        long endParallelStream = System.currentTimeMillis();
        System.out.println(endNormalStream);
        System.out.println("Time taken to process Parallel stream "+(endParallelStream-startParallelStream));

    }
}
