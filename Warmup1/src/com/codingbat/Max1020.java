package com.codingbat;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

public class Max1020 {

    public int max1020(int a, int b) {
        if ((10 <= a && 20 >= a) && (10 <= b && 20 >= b)) {
            return Math.max(a, b);
        } else if (10 <= a && 20 >= a) {
            return a;
        } else if (10 <= b && 20 >= b) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {

        Max1020 max1020 = new Max1020();
        System.out.println("Expected 19 -> returned: " + max1020.max1020(11, 19));
        System.out.println("Expected 19 -> returned: " + max1020.max1020(19, 11));
        System.out.println("Expected 11 -> returned: " + max1020.max1020(11, 9));
        System.out.println("Expected 11 -> returned: " + max1020.max1020(9, 11));
        System.out.println("Expected 11 -> returned: " + max1020.max1020(11, 21));
        System.out.println("Expected 11 -> returned: " + max1020.max1020(21, 11));
        System.out.println("Expected 0 -> returned: " + max1020.max1020(9, 21));
    }
}
