package CollectionsDemo;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        NavigableSet set =new TreeSet();
        set.add("sadasiva");
        set.add("srinath");
        set.add("sadasiva");
        set.add("123");
        set.add("123");
       // set.add(new Student(1,"ABC"));
       // set.add(new Student(2,"ABC"));
        System.out.println(set);
        System.out.println();
        /*System.out.println( set.contains(123));
        set.remove(123);
        set.add(null);
        System.out.println(set);*/
        System.out.println(set.headSet("srinath"));


    }
}
