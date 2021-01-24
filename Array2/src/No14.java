/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class No14 {

    public boolean no14(int[] nums) {

        if (nums.length == 0) return true;

        boolean no1 = true;
        boolean no4 = true;

        for (int num : nums) {
            if (num == 1) no1 = false;
            if (num == 4) no4 = false;
        }

        return no1 || no4;
    }
}
