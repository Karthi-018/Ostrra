package InheritEX;

public class Car extends Vehicle {
    public Car(){
        super(10);
    }
    public int j=20;
    public void drive(){
        System.out.println("car driving...");
    }

    public void path(String... arr){
        for (String curr : arr) {
            System.out.print(curr+"-> ");
        }
    }
}
