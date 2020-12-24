package com.codingbat;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

public class StringTimes {

    public String stringTimes(String str, int n) {

        String s = "";
        while (n > 0) {
            s += str;
            n--;
        }
        return s;
    }

    public static void main(String[] args) {

        StringTimes stringTimes = new StringTimes();
        System.out.println("Expected HiHi - > returned: " + stringTimes.stringTimes("Hi", 2));
        System.out.println("Expected HiHiHi - > returned: " + stringTimes.stringTimes("Hi", 3));
        System.out.println("Expected Hi - > returned: " + stringTimes.stringTimes("Hi", 1));
        System.out.println("Expected '' - > returned: " + stringTimes.stringTimes("Hi", 0));
    }
}
