package com.codingbat;

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

public class FirstHalf {

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {

        FirstHalf firstHalf = new FirstHalf();
        System.out.println("Expected Woo -> returned: " + firstHalf.firstHalf("WooHoo"));
        System.out.println("Expected Hello -> returned: " + firstHalf.firstHalf("HelloThere"));
        System.out.println("Expected abc -> returned: " + firstHalf.firstHalf("abcdef"));
    }
}
