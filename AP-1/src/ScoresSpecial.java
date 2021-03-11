public class ScoresSpecial {

	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecial(a) + largestSpecial(b);
	}

	public int largestSpecial(int[] scores) {
		int largest = 0;

		for (int score : scores) {
			if (isSpecial(score) && score > largest) largest = score;
		}
		return largest;
	}

	public boolean isSpecial(int score) {
		return score % 10 == 0;
	}
}
