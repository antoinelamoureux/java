
public class Car {
	String brand;
	String model;
	String color;
	int speed;
	int distance;

	Car(String brand, String model, String color, int speed, int distance) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.distance = distance;
	}

	public static void main(String[] args) {
		Car renault = new Car("Clio", "Renault", "Bleue", 80, 1500);
		renault.printTime();
		
		Car bmw = new Car("M8", "BMW", "Bleue", 150, 800);
		bmw.printTime();
		
	}
	
	public int getTime(int speed, int distance) {
		int time = distance / speed;
		return time;
	}
	
	public void printTime() {
		int time = getTime(speed, distance);
		System.out.println("The "+brand+" "+model+" of color "+color+" take "+time+" hours to travel "+distance+" kilometers");
	}

}
