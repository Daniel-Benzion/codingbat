package com.codingbat;

/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */

public class In3050 {

    public boolean in3050(int a, int b) {
        return ((30 <= a && 40 >= a) && (30 <= b && 40 >= b)) || ((40 <= a && 50 >= a) && (40 <= b && 50 >= b));
    }


    public static void main(String[] args) {

        In3050 in3050 = new In3050();
        System.out.println("Expected true -> returned: " + in3050.in3050(30, 31));
        System.out.println("Expected false -> returned: " + in3050.in3050(30, 41));
        System.out.println("Expected true -> returned: " + in3050.in3050(40, 50));
    }
}
