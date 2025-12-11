package m2_activity6;

public class MyApplication {
	public static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}
	
	public static void main(String[] args) {
		Car ford = new Car("Ford");
		Truck isuzu = new Truck("Isuzu");
		
		ford.startEngine();
		ford.refuel();
		
		isuzu.startEngine();
		isuzu.refuel();

		destroyVehicle(ford);
		destroyVehicle(isuzu);
	}

}
