
public class Max1020 {

	public static void main(String[] args) {
		System.out.print(max1020(11, 19));

	}

	public static int max1020(int a, int b) {
		if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
			return Math.max(a, b);
		} else if (a >= 10 && a <= 20 && !(b >= 10 && b <= 20)) {
			return a;
		} else if (!(a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
			return b;
		}

		return 0;
	}

}
