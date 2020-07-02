
public class DoubleX {

	public static void main(String[] args) {
		System.out.print(doubleX("axxb"));

	}
	
	static boolean doubleX(String str) {
			  int x = str.indexOf('x');
			  if (x+1 >= str.length()) return false;
			  
			  char c = str.charAt(x+1);
			  
			  if (c == 'x') {
			    return true;
			  }
			  
			  return false;
			}


}
