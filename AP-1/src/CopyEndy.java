public class CopyEndy {

	public int[] copyEndy(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;
		int total = 0;

		for (int num : nums) {
			if (isEndy(num)) {
				result[index] = num;
				index++;
				total++;
				if (total == count) break;
			}
		}
		return result;
	}

	public boolean isEndy(int n) {
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}
}
