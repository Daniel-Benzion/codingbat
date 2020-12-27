package com.codingbat;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */

public class Array123 {

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Array123 array123 = new Array123();
        int[] nums1 = {1, 1, 2, 3, 1};
        int[] nums2 = {1, 1, 2, 4, 1};
        int[] nums3 = {1, 1, 2, 1, 2, 3};

        System.out.println("Expected true -> returned: " + array123.array123(nums1));
        System.out.println("Expected false -> returned: " + array123.array123(nums2));
        System.out.println("Expected true -> returned: " + array123.array123(nums3));
    }
}
