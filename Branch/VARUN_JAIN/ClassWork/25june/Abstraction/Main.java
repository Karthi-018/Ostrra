
public class Main{
    public static void main(String a[]){
	  Vehicle v = new Vehicle();
	  v.displayCarDetails();
	  v.carName="Maruti";
	  v.setId("101");
	  v.carType="good";
	  v.carPrice=100000.0f;
	  v.displayCarDetails();
	  
	  
	  Vehicle v2 = new Vehicle("108", "suzuki", "nice", 20000.0f);
	  
	  
	  System.out.println(v2);
	
	}


}