package access;

public class AccessChildInsidePackage extends AccessModifiers{
    //While overriding u can increase or use same previlizes but u can't decrease it
    public void m1(){
        System.out.println("Hi");
    }
    public  void m3(){
        System.out.println("Hi");
    }
    //parent(private m2()) ->child(public m2()) are not overridden
    public void m2(){
        System.out.println("Hi2");
    }

    public static void main(String[] args) {
        AccessChildInsidePackage accessChildInsidePackage = new AccessChildInsidePackage();
        //default,protected and public can be accessed inside package if inheriting
    }
}
