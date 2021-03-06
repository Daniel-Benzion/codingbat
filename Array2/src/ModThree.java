/*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */

public class ModThree {

    public boolean modThree(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;


        for (int i = 0; i < nums.length; i++) {
            if (evenCount == 3 || oddCount == 3) {
                return true;
            }
            if (nums[i] % 2 == 0) {
                evenCount++;
                oddCount = 0;
            } else {
                oddCount++;
                evenCount = 0;
            }
        }

        return evenCount == 3 || oddCount == 3;
    }

}
