public class Bike extends Vehicle{
    String color;
    public int coveredDistance(int speed){
        return speed*50;
    }

    public void  putBreak(){
        System.out.println("Bike Break");
    }
    public void  clutch(){
        System.out.println("Bike Clutch ");
    }
}
