package m2_activity6;

public class Truck extends Vehicle implements Refuelable {
	public Truck(String brand) {
		this.brand = brand;
		this.numberOfWheels = 10;
	}
	public void startEngine() {
		System.out.println("Starting truck " + brand);
	}
	public void refuel() {
		System.out.println("Refuel truck " + brand);
	}
}
