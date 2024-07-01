package Problem1;

import java.util.*;

// import com.azul.tooling.ConsumerManager.Consumer;

public class Pro1 {


    public static void main(String[] args) {
        List<String> Cource = new ArrayList<String>();

        Cource.add("CSE");
        Cource.add("IT");
        Cource.add("ITE");
        Cource.add("CST");
        Cource.add("AI");

        // Consumer c = new Consumer(){
        //     public void accept(Object o){
        //         System.out.println(o);
        //     }
        // }

        
        Optional<String> str = Cource.stream().filter(c->c.contains("I")).findFirst();
        String str0 = Cource.parallelStream().filter(c->c.contains("I")).findAny().orElse("null");
        String str1 = Cource.parallelStream().filter(c->c.contains("I")).findFirst().orElse("Not Found");
        String str2 = Cource.stream().filter(c->c.contains("T")).findFirst().orElseThrow();
        // String str3 = Cource.stream().filter(c->c.contains("z")).findFirst().ifPresentOrElse(c -> System.out.println(c), ()->System.out.println("Not Found3"););
        System.out.println(str0);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

    }
}
