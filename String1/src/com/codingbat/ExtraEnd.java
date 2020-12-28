package com.codingbat;

/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */

public class ExtraEnd {

    public String extraEnd(String str) {
        String sub = str.substring(str.length() - 2);
        return sub + sub + sub;
    }

    public static void main(String[] args) {

        ExtraEnd extraEnd = new ExtraEnd();
        System.out.println("Expected lololo -> returned: " + extraEnd.extraEnd("Hello"));
        System.out.println("Expected ababab -> returned: " + extraEnd.extraEnd("ab"));
        System.out.println("Expected HiHiHi -> returned: " + extraEnd.extraEnd("Hi"));
    }
}
