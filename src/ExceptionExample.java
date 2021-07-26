public class ExceptionExample {
    public static void main(String[] args){
        try{
            doSomething();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(10/0);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("main");

    }
    public static void doSomething() throws ArithmeticException{

        doSomeMorething();
        System.out.println("doSomething");
    }
    public static void doSomeMorething() throws ArithmeticException{
        System.out.println(10/0);
        System.out.println("doSomeMorething");
    }
}
