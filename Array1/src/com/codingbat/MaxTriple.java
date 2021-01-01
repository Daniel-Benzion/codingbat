package com.codingbat;

/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */

public class MaxTriple {

    public int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int middle = (int)Math.floor(nums.length / 2);
        boolean firstBig = nums[0] > nums[middle] && nums[0] > nums[nums.length - 1];
        boolean midBig = nums[middle] > nums[0] && nums[middle] > nums[nums.length - 1];

        if (firstBig) {
            return nums[0];
        } else if (midBig) {
            return nums[middle];
        }
        return nums[nums.length - 1];
    }
}
