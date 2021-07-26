public class ArrayDemo {
    public static void main(String[] args) {
        String s1="Sadasiva";
        String s2="Sadasiva1";
        String s3="Sadasiv2";
        String s4="Sadasiva3";
        String s5="Sadasiva4";
        String s6="Sadasiva5";

        String[] s7;
        s7=new String[2];

        String[] s=new String[3];//initilization is mandatory
        s[0]="abcd";
        s[1]="bcdef";
        s[2]="";

        for(int j=0;j<s.length;j++){
            System.out.println(s[j]+ ":"+s[j].length());
        }
       // s[2]=5; - same type should be passed
        int[] a1=new int[4];
        a1[0]=10;
       // a1[1]=10.5f  -error
        a1[1]='a';
        a1[2]=2147483647;//2147483648 - too large
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
        System.out.println(a1);





    }
}
