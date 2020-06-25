public class Car extends Vehicule {
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.honk();
		
		System.out.println(myCar.brand+ " " +myCar.modelName);
	}	
}
