public class AccessExampleCar{
public String carNo;
public String carName;
protected String carOwner;
private float distTravelled;
public String getCarNo() {
	return carNo;
}
public void setCarNo(String carNo) {
	this.carNo = carNo;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarOwner() {
	return carOwner;
}
public void setCarOwner(String carOwner) {
	this.carOwner = carOwner;
}
public float getDistTravelled() {
	return distTravelled;
}
public void setDistTravelled(float distTravelled) {
	this.distTravelled = distTravelled;
}
public AccessExampleCar(String carNo, String carName, String carOwner, float distTravelled) {
	this.carNo = carNo;
	this.carName = carName;
	this.carOwner = carOwner;
	this.distTravelled = distTravelled;
}
@Override
public String toString() {
	return "AccessExampleCar [carNo=" + carNo + ", carName=" + carName + ", carOwner=" + carOwner + ", distTravelled="
			+ distTravelled + "]";
}

}