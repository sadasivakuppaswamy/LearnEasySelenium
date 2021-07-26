import javax.sound.midi.Soundbank;

public class JavaStaticInstance {
    public static int i;
    public int rollnumber;
    public String name;

    public JavaStaticInstance(){
        ++i;
    }
    public JavaStaticInstance(int rollnumber,String name){

        this.rollnumber=rollnumber;
        this.name=name;
    }
    public static void main(String[] args) {
        JavaStaticInstance javaStaticInstance = new JavaStaticInstance();
        System.out.println(i);
        javaStaticInstance.rollnumber=1;
        javaStaticInstance.name="sadasiva";
        JavaStaticInstance javaStaticInstance1 = new JavaStaticInstance();
        JavaStaticInstance javaStaticInstance2 = new JavaStaticInstance();
        JavaStaticInstance javaStaticInstance3 = new JavaStaticInstance();
        JavaStaticInstance javaStaticInstance4 = new JavaStaticInstance();

        System.out.println(javaStaticInstance.i);
        //System.out.println(javaStaticInstance.j);

        JavaStaticInstance sadasiva = new JavaStaticInstance(1,"sadasiva");
        JavaStaticInstance javaStaticInstance6 = new JavaStaticInstance(2,"Srikanth");
        System.out.println(javaStaticInstance6);
        System.out.println(sadasiva.name);
        System.out.println(sadasiva.assignValue("Kuppaswamy"));
    }
    public String assignValue(String name){
        this.name=name;
        ++i;
        return this.name;

    }
    static{
        System.out.println("HI");
    }


}
