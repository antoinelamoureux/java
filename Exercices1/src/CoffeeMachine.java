import java.util.Scanner;

public class CoffeeMachine {
	int brand;
	int size;
	String[] coffees;
	int water;

	public CoffeeMachine(int brand, int size, String[] coffees, int water) {
		this.brand = brand;
		this.size = size;
		this.coffees = coffees;
		this.water = water;
	}

	public static void main(String[] args) {
		getInput();
	}
	
	public static void getInput() {
		String[] coffees = new String[5];
		coffees[0] = "Latte";
		coffees[1] = "Cappuccino";
		coffees[2] = "Americano";
		coffees[3] = "Espresso";
		coffees[4] = "Restretto";

		Scanner sc = new Scanner(System.in);

		System.out.println("Selectionnez un café :");
		for (int i =0; i < coffees.length; i++) {
			System.out.println(i+1 +": " + coffees[i]);
		}
		int brand = sc.nextInt();

		System.out.println("Selectionnez un format :");
		System.out.println("1. Long\n2. Court");
		int size = sc.nextInt();
		
		sc.close();
		
		int water = getRange();
		
		CoffeeMachine myCoffee = new CoffeeMachine(brand, size, coffees, water); 
		printResult(getBrand(myCoffee.brand, myCoffee.coffees),getFormat(myCoffee.size), water);
	}
	
	public static int getRange() {
		int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
		
		return (int) (Math.random() * range) + min; 
	}
	
	public static String getFormat(int size ) {
		if (size == 1) {
			return "Long";	
		} else if (size == 2) {
			return "Court";
		} else {
			return "Format non disponible.";
		}
	}

	public static String getBrand(int brand, String[] coffees) {
		switch (brand) {
		case 1 :
			return coffees[0];
		case 2 :
			return coffees[1];
		case 3 :
			return coffees[2];
		case 4 :
			return coffees[3];
		case 5 :
			return coffees[4];
		default :
			return "Cette marque n'est pas disponible.";
		}
	}
	
	public static void printResult(String coffee, String size, int water) {
		if (water > 2) {
		System.out.println(coffee +" "+ size);
		} else {
			System.out.println("Il n'y a plus assez d'eau dans la machine");
		}
	}

}	

