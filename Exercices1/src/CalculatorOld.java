import java.util.Scanner;

public class CalculatorOld {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Entrez le premier nombre :");
		num1 = sc.nextInt();
		
		System.out.println("Entrez le deuxième nombre :");
		num2 = sc.nextInt();
		
		int choose;
		
		System.out.println("1: Addition, 2: Soustraction, 3: Multiplication, 4: Division");
		choose = sc.nextInt();
		sc.close();
		
		switch (choose){
		case 1:
			System.out.println(addition(num1,num2));
			break;
		case 2:
			System.out.println(subtraction(num1,num2));
			break;      
		case 3:
			System.out.println(multiplication(num1,num2));
			break;
		case 4:
			System.out.println(division(num1,num2));
			break;
		default:
			System.out.println("Erreur");
		}

	}

	public static int addition(int x, int y) {
		int result = x + y;
		return result;
	}

	public static int subtraction(int x, int y) {
		int result = x - y;
		return result;
	}

	public static int multiplication(int x, int y) {
		int result = x * y;
		return result;
	}

	public static int division(int x, int y) {
		int result = x / y;
		return result;
	}

}

