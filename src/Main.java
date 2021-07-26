public class Main {

    public static void main(String[] args) {

       /* String s1 ="Selenium";
        String s2 ="Selenium";
        String s5="Training";

        String s7 ="Seleniumtraining";
        //String s8 ="SeleniumTraining";
        String s6 = s2+"training";

        System.out.println(s6 == s7);
        //System.out.println(s8 == s7);
        String s3 =new String("Selenium");
        String s4 =new String("Selenium");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); //false
        System.out.println(s3 == s4); //false
       */
       StringBuffer sb1=new StringBuffer("Selenium");

        StringBuffer sb2 = sb1;
        sb1.append("training");


        System.out.println(sb1); //true
        System.out.println(sb1 == sb2); // true
        System.out.println(sb2); // true
        sb2.append("123");
        System.out.println(sb1); //true
        System.out.println(sb1 == sb2); // true
        System.out.println(sb2); // true





    }
}
