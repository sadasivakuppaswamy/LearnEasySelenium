public class Parent {
    public String value="parent";
    public String getValue(){
        return value;
    }
}
 class Child extends Parent{
    public String value="child";
    public String getValue(){
        return value;
    }

     public static void main(String[] args) {
         Parent child=new Child();
         Child child2=new Child();
         System.out.println(child.value+":"+child.getValue());
         System.out.println(child2.value+":"+child2.getValue());
     }
}
