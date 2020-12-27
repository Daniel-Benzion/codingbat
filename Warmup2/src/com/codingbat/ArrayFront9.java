package com.codingbat;

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

import java.util.Arrays;

public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {
        int i = 0;

        while(i < nums.length && i < 4) {
            if(nums[i] == 9)
                return true;

            i++;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 9, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 9};
        int[] nums3 = {1, 2, 3, 4, 5};

        ArrayFront9 arrayFront9 = new ArrayFront9();
        System.out.println("Expected true -> returned: " + arrayFront9.arrayFront9(nums1));
        System.out.println("Expected false -> returned: " + arrayFront9.arrayFront9(nums2));
        System.out.println("Expected false -> returned: " + arrayFront9.arrayFront9(nums3));
    }
}
