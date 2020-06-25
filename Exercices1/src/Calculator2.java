import java.util.Scanner;

public class Calculator2 {

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

		String operation = getInput();

		for (int i=0; i < operation.length() -1; i++) {
			char input = operation.charAt(i);

			String[] parts = new String[2];

			if  (input == '+' || input == '*' || input == '-' || input == '/') {
				if  (input == '-' || input == '/') {
					parts = operation.split(String.valueOf(input));

				} else if (input == '+' || input == '*'){

					parts = operation.split("\\" + String.valueOf(input));
				}

				getResult(input, Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));

			}
		}
	}

	public static void getResult(char input, int part1, int part2) {
		int result = 0;

		switch (input) {
		case '+' : 
			result = part1 + part2;
			break;
		case '-' :
			result = part1 - part2;
			break;
		case '*' :
			result = part1 * part2;
			break;
		case '/' :
			result = part1 / part2;
			break;
		default :
			break;
		}

		System.out.println(result);
	}
}

