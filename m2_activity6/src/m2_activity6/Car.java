package m2_activity6;

public class Car extends Vehicle implements Refuelable {
	public Car(String brand) {
		this.brand = brand;
		this.numberOfWheels = 4;
	}
	public void startEngine() {
		System.out.println("Starting car " + brand);
	}
	public void refuel() {
		System.out.println("Refuel car " + brand);
	}
}