import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    public static void main(String[] args) {
        Map<String, String> dir = new HashMap<>();
        dir.put("9876543210", "abc");
        dir.put("9206281952", "fjy");
        dir.put("7393602285", "pcw");
        dir.put("9306628196", "orq");

        for (String s : dir.keySet()) {
            System.out.println(s + " " + dir.get(s));
        }
    }
}