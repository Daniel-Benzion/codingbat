package com.codingbat;

/*
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */

public class LastDigit {

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public static void main(String[] args) {

        LastDigit lastDigit = new LastDigit();
        System.out.println("Expected true -> returned: " + lastDigit.lastDigit(7, 17));
        System.out.println("Expected false -> returned: " + lastDigit.lastDigit(6, 17));
        System.out.println("Expected true -> returned: " + lastDigit.lastDigit(3, 113));
    }
}
