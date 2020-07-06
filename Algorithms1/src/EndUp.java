
public class EndUp {

	public static void main(String[] args) {
		System.out.print(endUp("Hello"));
		
	}
	public static String endUp(String str) {
		  if (str.length() >= 3) {
		    String uppercased = str.substring(str.length() - 3, str.length()).toUpperCase();
		    
		    return str.replace(str.substring(str.length() - 3, str.length()), uppercased);
		  }
		  
		  return str.toUpperCase();
		}
}
