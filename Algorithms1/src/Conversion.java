
public class Conversion {

	public static void main(String[] args) {
		String montexte = new String("10");
		int i = Integer.parseInt(montexte);
		@SuppressWarnings("deprecation")
		Integer monnombre = new Integer(i);
		long j =  monnombre.longValue();
		
		String texte = "Java Java Java";
		texte = texte.replace('a', 'o');
		
		String textemaj = texte.toUpperCase();
		System.out.println(textemaj);
	}

}
