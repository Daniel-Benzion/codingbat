public class MaxSpan {

	public int maxSpan(int[] nums) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return 1;

		int maxSpan = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			int span = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					span = (j - i) + 1;
				}
			}
			if (span > maxSpan) maxSpan = span;
		}
		return maxSpan;
	}
}
