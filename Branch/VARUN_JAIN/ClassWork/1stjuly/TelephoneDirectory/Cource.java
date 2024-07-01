package TelephoneDirectory;
import java.util.*;

public class Cource {

    public static void main(String[] args) {
        List<String> Cource = new ArrayList<String>();
        Cource.add("English");
        Cource.add("Maths");
        Cource.add("Engineering");
        Cource.add("aitech");

        String f ="i";

        for(String c: Cource){
            if(c.contains(f)){
                System.out.println(c);
            }

        }

        
    }
    
}
