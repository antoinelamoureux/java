import java.util.Scanner;

public class Numbers {
	int n1;
	int n2;

	Numbers(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public static void main(String[] args) {
		getNumber();
	}

	public static void getEven(int n1, int n2) {
		for (int i=n1; i <= n2; i++) {
			if (i % 2 == 0)  {
				System.out.println(i);
			}
		}
	}

	public static void getNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez le premier nombre:");
		int n1 = sc.nextInt();
		System.out.println("Entrez le second nombre:");
		int n2 = sc.nextInt();
		sc.close();

		Numbers myNumber = new Numbers(n1, n2);
		getEven(myNumber.n1, myNumber.n2);
	}
}
