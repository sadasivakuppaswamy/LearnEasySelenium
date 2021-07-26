package access;

public class AccessTestInPackage {
    public static void main(String[] args) {
        AccessModifiers accessModifiers=new AccessModifiers();
        //accessModifiers.b1; -invalid
       // accessModifiers.m2(); --invalid
        System.out.println(accessModifiers.a1);
        //all other modifiers like private,protected and public methods and variables can be accessed

    }
}
