import java.lang.reflect.Array;

public class StringPalindrom {
    public static void main(String[] args) {
        String s1= "madam";
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                System.out.println(i);
                System.out.println("false");
                break;

            }
            else
            {
                System.out.println(i);
                System.out.println("true");
            }

        }
    }
}
