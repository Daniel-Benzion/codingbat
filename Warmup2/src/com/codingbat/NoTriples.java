package com.codingbat;

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

public class NoTriples {

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        NoTriples noTriples = new NoTriples();
        int[] arr1 = {1, 1, 2, 2, 1};
        int[] arr2 = {1, 1, 2, 2, 2, 1};
        int[] arr3 = {1, 1, 1, 2, 2, 2, 1};
        System.out.println("Expected true -> returned: " + noTriples.noTriples(arr1));
        System.out.println("Expected false -> returned: " + noTriples.noTriples(arr2));
        System.out.println("Expected false -> returned: " + noTriples.noTriples(arr3));
    }
}
