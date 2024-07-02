import java.util.*;

public class NameList {
    public String main2() {
        List<String> names = new ArrayList<>();
        names.add("yash");
        names.add("aish");
        names.add("pranay");

       for(var curr:names){
        String c= (String) curr;
        if(c.contains("i")){
         return ("found i in "+ c); 
        }
       }
       return "Not found";
    }

public static void main(String[] args){
    NameList m = new NameList();
    System.out.println(m.main2());
}
}