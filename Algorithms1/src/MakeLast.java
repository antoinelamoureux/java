import java.util.Arrays;

public class MakeLast {
	public static int[] makeLast(int[] nums) {
		  int[] array2 = new int[nums.length * 2];
		  int last = nums[nums.length-1];
		  array2[array2.length-1] = last;
		  
		  return array2;
		}

	public static void main(String[] args) {
		int[] nums =  {4, 5, 6};
		System.out.print(Arrays.toString(makeLast(nums)));
	}
}
