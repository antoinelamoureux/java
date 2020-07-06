
public class Last2 {

	public static void main(String[] args) {
		System.out.print(last2("1717171"));

	}
	
	public static int last2(String str) {
		  int count = 0;
		  String str2 = "";
		  
		  if (str.length() > 2) {
		  for (int i = 0; i < str.length()-1; i++) {
		    str2 = str.substring(i, i+2);
		    if (str.substring(i+1, str.length()).contains(str2) && str.substring(str.length()-2, str.length()).equals(str2)) {
		      count++;
		    } 
		  }
		  
		  }
		  
		  return count;
		}
}
