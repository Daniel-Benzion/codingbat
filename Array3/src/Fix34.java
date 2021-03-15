import java.util.Arrays;

public class Fix34 {

	public static int[] fix34(int[] nums) {
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length; j++) {
				if (nums[i] == 4 && nums[j] == 3) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 1, 4, 4, 3, 1};
		int[] result = fix34(arr);
		System.out.println(Arrays.toString(result));
	}
}
