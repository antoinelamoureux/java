import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println(" un nombre aléatoire  = "+Math.random() );
		
		BigDecimal payment = new BigDecimal("1234.567");
	    NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	    String s = n.format(payment);
	    System.out.println(s);
	  }
	}

