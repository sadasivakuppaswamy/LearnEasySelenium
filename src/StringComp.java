public class StringComp {
    public static void main(String[] args) {
        String s1="Sipling";
        String s2="Sipling";
        String s3 = new String("Sipling");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1==s2);
        System.out.println(s2==s3);

    }
}
