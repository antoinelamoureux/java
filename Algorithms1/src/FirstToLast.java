
public class FirstToLast {

	public static void main(String[] args) {
		System.out.println(frontBack("code"));

	}

	public static String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		char firstC = str.charAt(0);
		char lastC = str.charAt(str.length()-1);
		
		String str2 = lastC + str.substring(1,str.length()-1) + firstC;

		return str2;
	}

}
