package InheritEX;

public class InteritMain {
    public static void main(String[] args) {
        Car car= new Car();
        System.out.println(car.Name);
        new Vehicle().drive();
       new Bus().drive();
       System.out.println(new TwoSeaterCar().totalSeats);
        System.out.println(car.j);
        car.path("UP","LEFT","R","R","U");
        Vehicle v1= new Car();
        v1.drive();
    }
}
