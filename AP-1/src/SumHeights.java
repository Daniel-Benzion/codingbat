public class SumHeights {

	public int sumHeights(int[] heights, int start, int end) {

		int sum = 0;
		int location = heights[start];

		for (int i = start + 1; i <= end; i++) {
			sum += Math.abs(location - heights[i]);
			location = heights[i];
		}
		return sum;
	}
}
