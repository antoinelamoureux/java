
public class FrontTimes {
	
	public static String frontTimes(String str, int n) {
		  String result = "";
		  
		  if (str.length() < 3) {
		    for (int i = 0; i < n; i++) {
		    result += str.substring(0, str.length());
		    }
		  } else {
		    for (int i = 0; i < n; i++) {
		      result += str.substring(0, 3);
		    }
		  }
		  return result;
		}

	public static void main(String[] args) {
		System.out.print(frontTimes("Chocolate", 2));
	}

}
