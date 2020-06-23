public class MathExercise {
	int x;
	int y;
	
	MathExercise(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(java.lang.String[] args) {
		MathExercise number = new MathExercise(5,2);
		System.out.println(Math.pow(number.x, number.y));
		System.out.println(Math.max(number.x, number.y));
		System.out.println(Math.min(number.x, number.y));
		
		double randomNumber = Math.random();
		System.out.println(randomNumber);	
	}
}

// Math powerInt = new Math();