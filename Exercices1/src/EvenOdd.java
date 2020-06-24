import java.util.Scanner;

public class EvenOdd {
	static int number; 

	EvenOdd(int number) {
		EvenOdd.number  = number;
	}

	public static void main(String[] args) { 
		checkNumber();
	}

	public static void checkNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre: ");

		number = sc.nextInt();

		if (number != 0) {

			if (number % 2 == 0) {
				System.out.println(number+" est un nombre pair.");
			} else {
				System.out.println(number+" est un nombre impair.");
			}

		}

		sc.close();
	}


}
