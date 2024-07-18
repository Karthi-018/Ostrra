package edu.osttra.capstone;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceService {

    private static Map<String, List<Resource>> resourceMap = new HashMap<>();

    static {
        List<Resource> resources1 = new ArrayList<>();
        resources1.add(new Resource("1", "Resource A", "RTN1", null));
        resources1.add(new Resource("2", "Resource B", "RTN1", null));
        resourceMap.put("RTN1", resources1);

    }

    public List<Resource> getResourceByRn(String rn) {
        return resourceMap.getOrDefault(rn, new ArrayList<>());
    }
}
