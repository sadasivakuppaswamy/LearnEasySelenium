package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<Integer, String>();
        map.put(4,"sadasiva");
        map.put(2,"sadasiva2");
        map.put(3,"sadasiva3");
        map.put(4,"sadasiva4");
        map.put(1,"sadasiva5");
        System.out.println(map);
    }
}
