import java.util.*;
public class ListDemo {
    public static void main(String[] args)
     {
        List list=new ArrayList(5);
        list.add(10);
        list.add(20);
        list.add(50);
        list.remove(1);
       // list.forEach(System.out::println); 
       System.out.println(list);
       Collections.sort(list);
       Collections.shuffle(list);
       Collections.max(list);
    //    Collections.swap(list,3,7);
       System.out.println("Max"+ Collections.max(list));

    }
}
