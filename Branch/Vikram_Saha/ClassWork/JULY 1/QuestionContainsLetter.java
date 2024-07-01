import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class QuestionContainsLetter {
public static void main(String[] args) {
   // System.out.println(searchLetter());
    List<String> names= new ArrayList<>();
    names.add("ABC");
    names.add("ABCD");
    names.add("ABCDE");
    names.add("ABCDEF");
    Consumer c= new Consumer<String>() {

        @Override
        public void accept(String t) {
            // TODO Auto-generated method stub
            System.out.println("hi");
        }
        
    };

    String str=names.stream().filter(a->a.contains("C")).findFirst().orElse("Not Found");
    System.out.println(str);
}
public static String searchLetter(){
    List names= new ArrayList<>();
    names.add("ABC");
    names.add("ABCD");
    names.add("ABCDE");
    names.add("ABCDEF");
    
    for( var curr:names){
        String c=(String) curr;
        if(c.contains("E")){
            return ("FOUND E IN "+c);
        }
    }
    return ("NOT FOUND");
}
}
