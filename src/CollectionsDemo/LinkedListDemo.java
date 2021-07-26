package CollectionsDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add("sadasiva");
        list.add("sadasiva");
        list.add("srinath");
        list.add(null);
        list.add(123);
        list.add(new Student(2,"abc"));
        list.add(0,"ABC");
        //list.remove("sadasiva");
        System.out.println(list);
        list.remove("sadasiva");
        System.out.println(list);
        System.out.println(((Student)list.get(5)).rollNumber);

    }
}
