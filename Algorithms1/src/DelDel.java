
public class DelDel {

	public static void main(String[] args) {
		System.out.print(delDel("adelHello"));

	}
	
	public static String delDel(String str) {
		  if (str.length() >= 4 && str.substring(1, 4).contains("del")) {
		    return str.replace("del", "");
		  } else {
		    return str;
		  }
		  
		}
}
