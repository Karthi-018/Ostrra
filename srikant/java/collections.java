import java.util.*;

public class collections{
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);

        Iterator i = l.iterator();
        while(i.hasNext()){
            int x =(int) i.next();
            System.out.print(x*x + " ");
        }
    }
}