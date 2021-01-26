/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */

public class Has12 {

    public boolean has12(int[] nums) {

        boolean hasOne = false;
        int oneIdx = 0;
        boolean hasTwo = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOne = true;
                oneIdx = i;
                break;
            }
        }

        if (!hasOne) return false;

        for (int j = oneIdx; j < nums.length; j++) {
            if (nums[j] == 2) {
                hasTwo = true;
                break;
            }
        }
        return hasTwo;
    }
}
