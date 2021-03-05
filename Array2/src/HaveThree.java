/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */

public class HaveThree {

	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean prev = false;

		for (int num : nums) {
			if (num == 3) {
				count++;

				if (prev) {
					return false;
				} else {
					prev = true;
				}
			} else {
				prev = false;
			}
		}
		return count == 3;
	}
}
