package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        String[] s=new String[10];
        s[0]="Sadasiva";

        /*ArrayList list=new ArrayList();
        list.add("sadasiva");
        list.add(123);
        list.add('c');
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            char ch = ((String)iterator.next()).charAt(0);
        }*/

        /*ArrayList<String> list=new ArrayList<String>();
        list.add("sadasiva");
        list.add("123");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            char ch = iterator.next().charAt(0);
        }*/

        ArrayList<Object> list=new ArrayList<Object>();
        list.add("sadasiva");
        list.add(123);

        Iterator<Object> iterator=list.iterator();
        while (iterator.hasNext()){
            char ch = ((String)iterator.next()).charAt(0);
        }

        List<Object> list1 = new ArrayList<Object>();

        List<? extends Number> list2=new ArrayList<Byte>();
        list2.add(null);

        List<? extends Loan> list3=new ArrayList<SBI>();
        list3.add(null);

        //
        List<?> list4=new ArrayList<>();
        list.add("sadasiva");
        list.add(123);
        //



    }
}
