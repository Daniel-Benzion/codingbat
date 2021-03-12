public class BigHeights {

	public int bigHeights(int[] heights, int start, int end) {
		int sum = 0;
		int location = heights[start];
		for (int i = start + 1; i <= end; i++) {
			if (Math.abs(location - heights[i]) >= 5) {
				sum++;
			}
			location = heights[i];
		}
		return sum;
	}
}
