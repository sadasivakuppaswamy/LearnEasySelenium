package generics;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        m1(new ArrayList<>());
    }
    public static void m1(ArrayList<String> al){
        al.add("sadasiva");
        al.add(null);
        //al.add(123);

    }
    public static void m2(ArrayList<? extends Number> al){

        al.add(null);
       // al.add(123);

    }
    public static void m21(ArrayList<? extends String> al){

        al.add(null);
        //al.add("sadas");
        // al.add(123);

    }
    public static void m3(ArrayList<? extends Loan> al){ //Loan is interface
        //al.add("sadasiva");
        al.add(null);
        //al.add(new SBI());
        //al.add(123);

    }
    public static void m4(ArrayList<? super Number> al){

        al.add(null);
        al.add(123);
        al.add(10L);
        al.add(10.6f);
        al.add((Number)123);

    }
    public static void m7(ArrayList<? super String> al){

        al.add(null);
        al.add("sadasiva");

    }
    public static void m5(ArrayList<? super Account> al){

        al.add(null);
        al.add(new Account() {
            @Override
            public void getKYC() {

            }

            @Override
            public void getATM() {

            }
        });
        al.add(new SBI());
       // al.add(new Loan());

    }
}
