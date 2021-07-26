public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException {
        /*System.out.println(10/0);
        try{
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hi");*/
        String[] strings = new String[4];
        for(int i=0;i<=4;i++){
            strings[i]=""+i;
        }
        Thread.sleep(300);
    }
}
