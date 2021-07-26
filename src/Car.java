public class Car extends Vehicle{
    String color;

    public int coveredDistance(int speed,int distance){
        return speed*distance;
    }
    public void  putBreak(){
        System.out.println("Car Break");
    }
    public void reverseGear(){
        System.out.println("Car Reverse Gear");
    }

}
