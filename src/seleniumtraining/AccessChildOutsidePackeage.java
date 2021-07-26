package seleniumtraining;

import access.AccessModifiers;

public class AccessChildOutsidePackeage extends AccessModifiers {
    public static void main(String[] args) {
        AccessChildOutsidePackeage accessChildOutsidePackeage =new AccessChildOutsidePackeage();
        //protected,public can be accessed outside package if inheriting
    }
}
