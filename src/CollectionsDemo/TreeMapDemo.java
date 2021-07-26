package CollectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<Integer, String>();
        map.put(4,"sadasiva");
        map.put(2,"sadasiva2");
        map.put(3,"sadasiva3");
        map.put(4,"sadasiva4");
        map.put(1,"sadasiva5");
        map.put(0,"sadasiva5");
        System.out.println(map);
    }
}
