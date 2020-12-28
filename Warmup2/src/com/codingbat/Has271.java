package com.codingbat;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */

public class Has271 {

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && ((nums[i]) - (nums[i + 2]) >= -1) && ( (nums[i]) - (nums[i + 2])  <= 3) ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Has271 has271 = new Has271();
        int[] arr1 = {1, 2, 7, 1};
        int[] arr2 = {1, 2, 8, 1};
        int[] arr3 = {2, 7, 1};
        System.out.println("Expected true -> returned: " + has271.has271(arr1));
        System.out.println("Expected false -> returned: " + has271.has271(arr2));
        System.out.println("Expected true -> returned: " + has271.has271(arr3));
    }
}
