
import java.util.*;

public class MakeMap {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("a","9187");
        m.put("b","917"); 
        m.put("c","97");
        System.out.println(m.get("b"));
       System.out.println(m.keySet()); 
       System.out.println(m.values()); 
    }
}
