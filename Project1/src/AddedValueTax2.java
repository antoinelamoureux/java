import java.util.Scanner;

public class AddedValueTax2 {
	double price;
	double rate;

	
	AddedValueTax2(double price, double rate) {
		this.price = price;
		this.rate = rate;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product:");
		double price = sc.nextInt();
		System.out.println("Enter the rate:");
		double rate = sc.nextInt();
	
		AddedValueTax2 computer = new AddedValueTax2(price, rate);
		
		computer.printTaxValue();
	}
	
	public double getTaxValue(double price, double rate) {
		double taxValue = (price * rate) / 100;
		return taxValue;
	}
	
	public void printTaxValue() {
		double taxValue = getTaxValue(price, rate);
		System.out.print("The TVA is :"+taxValue);
	}
}
