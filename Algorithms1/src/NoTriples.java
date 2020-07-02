
public class NoTriples {

	public static void main(String[] args) {
		int[] array = {1, 1, 1, 2, 2, 2, 1};
		
		System.out.print(noTriples(array));

	}
	
	public static boolean noTriples(int[] nums) {
		if (nums.length > 2) {
		  for (int i = 0; i < nums.length-1; i++) {
		    if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
		      return false;
		    }
		  }
		}
		  return true; 
		}

}
