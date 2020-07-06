
public class LargestFiveDigitNumber {

	    public static int solve(String digits) {
	    int[] nums = new int[digits.length()];
	    
	    String sequence = "";
	    
	    for (int i =0; i < digits.length(); i++) {
	      char c = digits.charAt(i);
	      nums[i] = Character.getNumericValue(c);
	    }
	    
	     for (int i = 0; i < nums.length; i++) { 
	        if (nums[i] < nums[i + 1]) {
	        	System.out.print(i);
	        	sequence += nums[i];
	        }
	   }
	     
	  int result = Integer.parseInt(sequence);
	        return result; 
	  }
//
	public static void main(String[] args) {
		System.out.print(solve("283910"));
	}

}
