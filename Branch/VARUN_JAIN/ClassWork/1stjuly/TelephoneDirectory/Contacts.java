package TelephoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    public static void main(String[] args) {
        Map<String, String> contact =new HashMap<>();
        
        contact.put("svfd", "+91-234565678");
        contact.put("ku,gyfd", "+91-345678677");
        contact.put("Varun", "+91-123456789");
        contact.put("kjhgf", "+91-789456758");
        contact.put("fd", "+91-345676789");

        System.out.println(contact.get("Varun"));
    }
}
