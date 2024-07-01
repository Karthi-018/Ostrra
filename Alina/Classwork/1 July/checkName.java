import java.util.*;
public class checkName {

    public static void main(String[] args) {
        List<String> addName= new ArrayList<>();  
        addName.add("Alina");
        addName.add("Yashi");
        addName.add("Varun");
        addName.add("Vidhi");
        String pt="d";
        String found="";
for(String s: addName)
{
    if(s.contains(pt))
    {
        found =s;
        break;
    }
}
System.out.println("The Word:"+pt+ " is present in the word:"+found);
    }
}
