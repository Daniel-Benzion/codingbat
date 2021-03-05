/*
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
 */

public class Scores100 {

	public boolean scores100(int[] scores) {
		boolean hundred = false;

		for (int score : scores) {
			if (score == 100) {
				if (hundred) return true;
				hundred = true;
			} else {
				hundred = false;
			}
		}
		return false;
	}
}
