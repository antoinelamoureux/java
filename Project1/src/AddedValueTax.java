
public class AddedValueTax {
	double price;
	double rate;
	
	AddedValueTax(double price, double rate) {
		this.price = price;
		this.rate = rate;
	}

	public static void main(String[] args) {
		AddedValueTax computer = new AddedValueTax(600, 20);
		computer.printTaxValue();
	}
	
	public double getTaxValue(double price, double rate) {
		double taxValue = (price * rate) / 100;
		return taxValue;
	}
	
	public void printTaxValue() {
		double taxValue = getTaxValue(price, rate);
		System.out.print(taxValue);
	}
	
}
