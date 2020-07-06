
public class HowManyNumbers {
	
	public static int[] findAll(int number1, int number2) {
		int[] values = new int [3];
		String[] totalNumbers = {"118", "127", "136", "145", "226", "235", "244", "334"};
		int[] n = new int[3];
		
		String nb1 = Integer.toString(number1);
		
		for (int i = 0; i < totalNumbers.length; i++) {
			String numberThree = totalNumbers[i];
			System.out.println(totalNumbers[i]);
			for (int j = 0; j <= numberThree.length(); i++) {
				n[j] = Character.digit(numberThree.charAt(j), 10);
				n[j+1] = Character.digit(numberThree.charAt(j+1), 10);
				n[j+2] = Character.digit(numberThree.charAt(j+2), 10);
			}
		}
		System.out.println(n);
		
		for (int i = 0; i < totalNumbers.length; i++) {
			
			if (Integer.parseInt(nb1.substring(0,1)) == 10 && Integer.parseInt(nb1.substring(i)) >= Integer.parseInt(nb1.substring(i+1))) {
			}
		}
		
		return n;
	}

	public static void main(String[] args) {
		findAll(10, 3);

	}

}
