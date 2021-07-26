package access;

public class AccessModifiers {
    int a1=10;
    private int b1=20;
    public int c1=30;
    protected  int d1=40;

    public void m1(){
        System.out.println("m1 public");
    }
    private void m2(){
        System.out.println("m2 private");
    }
    protected void m3(){
        System.out.println("m3 protected");
    }
    void m4(){
        System.out.println("m4 defeault");
    }
}
