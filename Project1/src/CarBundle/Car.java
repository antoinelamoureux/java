package CarBundle;
import java.util.Arrays;
import java.util.Scanner;

public class Car {
	CarType[] cars;
	
	
	Car(CarType[] cars) {
		this.cars = cars;
	}
	
	public static void main(String[] args) {
		CarType bmw = new CarType("M8", "BMW", "Bleue", 150, 500);
		cars.append(bmw);
	
		for(int i = 0; i < cars.lenght; i++) {
			cars[i].printTime();
		}		
	}
	
	public int getTime(int speed, int distance) {
		int time = cars[0].distance / cars[0].speed;
		return time;
	}
	
	public void printTime() {
		int time = getTime(cars[].speed, cars[0].distance);
		System.out.println("The "+cars[0].brand+" "+cars[0].model+" of color "+cars[0].color+" take "+time+" hours to travel "+cars[0].distance+" kilometers");
	}

}
