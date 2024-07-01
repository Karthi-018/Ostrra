import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class CharacterSearch {

    public static void main(String[] args) {
        List<String> courseList = Arrays.asList("Java", "C++", "Python", "Javascript");
        
        // Consumer c = new Consumer(){
        //     @Override
        //     public void accept(Object o){
        //         System.out.println(o);
        //     }
        // };

        // Runnable r = new Runnable() {
        //     @Override
        //     public void run(){
        //         System.out.println("not found");
        //     }
        // };

        Optional<String> str = courseList.stream().filter(s -> s.contains("y")).findAny();
        System.out.println(str.get());
        courseList.stream().filter(s -> s.contains("z")).findFirst().ifPresentOrElse(c->System.out.println(c),()->System.out.println("not found"));
    }
}