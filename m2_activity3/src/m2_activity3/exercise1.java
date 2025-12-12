package m2_activity3;

public class exercise1 {
	public static void main(String[] args) {
		
		car cardetails = new car();
		cardetails.setBrand("Mazda");
		cardetails.setModel("Familia");
		cardetails.register(null);
		
		car cardetails2 = new car("Isuzu","Gemini");
		cardetails2.register(null);
	}

}
