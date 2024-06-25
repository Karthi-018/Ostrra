class Vehicle{
    private String carId;
	public String carName;
	public String carType;
	protected float carPrice;
	/*public int count;*/
	
	Vehicle(){
		super();
		carId = "100";
		carName =  "Car Name";
		carType = "Car Type";
		carPrice = 0.0f;
	}
	Vehicle(String carId, String carName, String carType, float carPrice){
		this.carId = carId;
		this.carName =  carName;
		this.carType = carType;
		this.carPrice = carPrice;
	}
	
	public void setId(String id){
	  carId=id;
	}
	
	public String getId(){
	  return carId;
	}
	
	
	void displayCarDetails(){
	  System.out.println(getId());
	  System.out.println(carName);
	  System.out.println(carPrice);
	  System.out.println(carType);
	}
	
	public String toString(){
		return carId + carName;
	}
	
	
}