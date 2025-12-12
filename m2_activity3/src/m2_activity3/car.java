package m2_activity3;

public class car {
	private String brand;
	private String model;
	
public car(){
	}
	
		public car(String brand,String model) {
				this.brand=brand;
				this.model=model;
		}
		public String getBrand() {
			return brand;
	}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model=model;
		}
		public void register(String carinfo) {
			System.out.println("My car is " + this.brand + " " + this.model);
		}
	
	
}
