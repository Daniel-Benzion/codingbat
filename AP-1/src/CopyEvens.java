public class CopyEvens {

	public int[] copyEvens(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;
		int total = 0;

		for (int num : nums) {
			if (num % 2 == 0) {
				result[index] = num;
				index++;
				total++;
				if (total == count) break;
			}
		}

		return result;
	}
}
