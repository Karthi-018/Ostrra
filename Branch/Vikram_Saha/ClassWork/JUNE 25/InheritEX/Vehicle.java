package InheritEX;

public class Vehicle {
    int j;
    void drive(){System.out.println("driving a vehicle");}
    Vehicle(int x){j=x; System.out.println("param const");}
    Vehicle(){System.out.println("dflt const");}
    public String Name;
}
