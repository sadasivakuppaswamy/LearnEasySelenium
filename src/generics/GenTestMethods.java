package generics;

import java.util.ArrayList;

public class GenTestMethods {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("sadasiva");
        //s1.add(124);
        System.out.println(s1);
        m1(s1);
        //s1.add(534);
        System.out.println(s1);
    }
    public static void m1(ArrayList al){
        al.add(123);
        al.add('f');

    }
}
