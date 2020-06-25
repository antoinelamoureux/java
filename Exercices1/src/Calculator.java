import java.util.Scanner;
import java.lang.Character;

public class Calculator {
	int result = 0;


	public static void main(String[] args) {	
		setOperation();
	}

	public static String getInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez une opération : ");
		String operationInput = sc.nextLine();
		sc.close();

		String operation = operationInput.replaceAll(" ","");
		return operation;
	}

	public static void setOperation() {
		Calculator myCalculator = new Calculator();

		String operation = getInput();

		for (int i=0; i < operation.length() -1; i++) {
			char inputChar = operation.charAt(i);
			int input = inputChar;
			
			if (Character.isDigit(inputChar)) {
				input = Character.getNumericValue(inputChar); 
			}

			if (i > 0) {
				char previousChar = operation.charAt(i -1);
				char nextChar = operation.charAt(i +1);

				int previousInt = Character.getNumericValue(previousChar);  
				int nextInt = Character.getNumericValue(nextChar);

//				System.out.println(previousInt);
//				System.out.println(nextInt);

				switch (input) {
				case '+' : 
					myCalculator.result += previousInt + nextInt;
					break;
				case '-' :
					myCalculator.result += previousInt - nextInt;
					break;
				case '*' :
					myCalculator.result += previousInt * nextInt;
					break;
				case '/' :
					myCalculator.result += previousInt / nextInt;
					break;
				default :
					break;
				}

			}

		}
		System.out.println(myCalculator.result);
	}
}

