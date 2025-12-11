package m2_activity6;

public abstract class Vehicle {
	int numberOfWheels;
	String brand;

abstract void startEngine();

void destroy() {
	System.out.println("Destroying " + brand);
}
}
