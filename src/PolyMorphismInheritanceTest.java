public class PolyMorphismInheritanceTest {
    public static void main(String[] args) {

/*
        Vehicle vehicle=new Vehicle();
        System.out.println(vehicle.color);
        System.out.println(vehicle.coveredDistance(40));
        vehicle.putBreak();

*/
        Car car= new Car();
        System.out.println(car.color);
        System.out.println(car.coveredDistance(40));
        car.putBreak();
        car.reverseGear();
        car.Load();
        System.out.println(car.coveredDistance(10,20));


      /*  Vehicle vehicle1 = new Car();

        System.out.println(vehicle1.color);
        System.out.println(vehicle1.coveredDistance(40));
        vehicle1.putBreak();
        vehicle1.Load();
        System.out.println(vehicle1.coveredDistance(50));
*/

      /*  Vehicle vehicle2 = new Bike();

        System.out.println(vehicle2.color);
        System.out.println(vehicle2.coveredDistance(40));
        vehicle2.putBreak();
        vehicle2.Load();
        System.out.println(vehicle2.coveredDistance(50));

*/

    }
}
