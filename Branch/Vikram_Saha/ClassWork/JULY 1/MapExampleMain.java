import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleMain {
public static void main(String[] args) {
    Map mp= new HashMap<>();
    mp.put(1, "A");
    mp.put(2, "B");
    mp.put(3, "C");
    System.out.println(mp.get(1));
    mp.keySet().forEach(a->System.out.println(a));
    mp.values().forEach(a->System.out.println(a));
}
}
