package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("sadasiva");
        list.add("sadasiva");
        list.add(123); //Integer
        list.add(new Student(1,"sada"));
        System.out.println(list.size());
        list.add(5,"sadasiva2");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(0,"ABC");
        System.out.println(list);

        List list1=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("c");


        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.contains("sadasiva"));
        System.out.println(list.lastIndexOf("sadasiva"));
        System.out.println(list.retainAll(list1)); //check
        System.out.println(list);

        //newCapacity=current*3/2+1

    }
}
