public class SumHeights2 {

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		int location = heights[start];

		for (int i = start + 1; i <= end; i++) {
			if (heights[i] > location) {
				sum += Math.abs(location - heights[i]) * 2;
			} else {
				sum += Math.abs(location - heights[i]);
			}
			location = heights[i];
		}
		return sum;
	}
}
