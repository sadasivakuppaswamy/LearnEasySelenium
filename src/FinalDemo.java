 public class FinalDemo {
    final int a=10;
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo=null;

    }
    public final void testFinal(){
        System.out.println("testFinal");
    }
}
class FinalDemoChild extends FinalDemo{
    public void testFinal2(){
        System.out.println("testFinal");
    }
}