/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

public class Lucky13 {

    public boolean lucky13(int[] nums) {

        if (nums.length == 0) return true;

        for (int num : nums) {
            if (num == 1 || num == 3) return false;
        }

        return true;
    }
}
