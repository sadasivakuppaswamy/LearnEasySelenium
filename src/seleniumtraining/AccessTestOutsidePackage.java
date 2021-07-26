package seleniumtraining;

import access.AccessModifiers;

public class AccessTestOutsidePackage {
    public static void main(String[] args) {
        AccessModifiers accessModifiers =new AccessModifiers();
        accessModifiers.m1();
        System.out.println(accessModifiers.c1);
    }
}
