package CollectionsDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<Student>();
        set.add(new Student(1,"sadasiva"));
        set.add(new Student(6,"sadasiva1"));
        set.add(new Student(3,"sadasiva2"));
        set.add(new Student(0,"sadasiva3"));
        set.add(new Student(5,"sadasiva4"));
        set.add(new Student(1,"sadasiva6"));
        System.out.println(set);
        Iterator<Student> iterator= set.iterator();
        int i=10;
        while (iterator.hasNext()){
            iterator.next().rollNumber=i++;

        }
        System.out.println(set);

    }
}
