import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

// import com.azul.tooling.ConsumerManager.Consumer;

public class StreamApii{
        public static void main(String[] args) {
            
        
List<String> names = Arrays.asList("yash", "ash", "pranay", "john");

        Stream<String> s1 = names.stream();
        // Optional<String> s2= s1
        //         .filter(name -> name.contains("i"))
        //         .map(a->a.toUpperCase()).findFirst();
        Consumer c = new Consumer(){

                @Override
                public void accept(Object t) {
                       System.out.println(t);
                }

                
        };
        Runnable r = new Runnable() {
                @Override
                public void run(){
                        System.out.println("i not found");
                }
        };
                s1
                .filter(name -> name.contains("i"))
                .map(a->a.toUpperCase()).findFirst().ifPresentOrElse(c1->System.out.println(c1),()->System.out.println("not found"));
               // .collect(Collectors.toList()) ;
                // System.out.println(s2);
}}