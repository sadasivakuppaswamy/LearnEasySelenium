package CollectionsDemo;

//mport com.sun.tools.javac.code.Scope;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(4,"sadasiva");
        map.put(2,"sadasiva1");
        map.put(3,"sadasiva2");
        map.put(6,"sadasiva4");
        map.put(1,"sadasiva5");
        System.out.println(map);
        Set<Integer> keys =map.keySet();
        Iterator itr= keys.iterator();
        while (itr.hasNext()) {
            int key=(int)itr.next();
            System.out.println(key +map.get(key));
        }

        /*for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }*/



    }
}
