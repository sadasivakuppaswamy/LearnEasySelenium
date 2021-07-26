public class Vehicle {
    static int a=10;
    String color = "White";
    public int coveredDistance(int speed){
        return speed*60;
    }
    public int coveredDistance(int speed,int distance){
        return speed*60;
    }

    public void putBreak(){
        System.out.println("Vehicle Break");
    }

    public void Load(){
        System.out.println("Vehicle Load");
    }
}
