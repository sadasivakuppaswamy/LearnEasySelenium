package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set set =new LinkedHashSet();
        set.add("sadasiva");
        set.add("srinath");
        set.add("sadasiva");
        /*set.add(new Student(1,"ABC"));
        set.add(new Student(1,"ABC"));
        */
        set.add(123);
        set.add(123);
        System.out.println(set);
        System.out.println( set.contains(123));
        set.remove(123);
        set.add(null);
        System.out.println(set);
    }
}
