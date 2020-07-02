
public class AltPairs {

	public static void main(String[] args) {
		System.out.print(altPairs("Chocolate"));

	}
	
	public static String altPairs(String str) {
		  String str2 = "";

		if (str == "") return str2;
		if (str.length() < 2) return str.substring(0,1);

		if (str.length() > 1) {
		  for (int i = 0; i < str.length(); i += 4) {
		    int end = i+2;
		    if (end > str.length()) end = str.length();
		    
		    str2 = str2 + str.substring(i,end);
		  }
		} 
		  return str2;
		}

}
