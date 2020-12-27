package com.codingbat;

/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

import java.util.Arrays;

public class ArrayCount9 {

    public int arrayCount9(int[] nums) {
        int i = 0;
        int counter = 0;
        while (i < nums.length) {
            if (nums[i] == 9) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static void main(String[] args) {

        ArrayCount9 arrayCount9 = new ArrayCount9();
        System.out.println("Expected 1 -> returned: " + arrayCount9.arrayCount9([1, 2, 9]));
        System.out.println("Expected 2 -> returned: " + arrayCount9.arrayCount9([1, 9, 9]));
        System.out.println("Expected 3 -> returned: " + arrayCount9.arrayCount9([1, 9, 9, 3, 9]));
    }
}
