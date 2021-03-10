public class ScoresAverage {

	public int scoresAverage(int[] scores) {
		int firstStart = 0;
		int secondStart = scores.length/2;
		int firstEnd = secondStart - 1;
		int secondEnd = scores.length - 1;

		return Math.max(average(scores, firstStart, firstEnd), average(scores, secondStart, secondEnd));
	}

	public int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += scores[i];
		}
		return sum / ((end - start) + 1);
	}
}
