package com.codingbat;

/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class FrontBack {

    public String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        return last + str.substring(1, str.length() - 1) + first;
    }

    public static void main(String[] args) {
        FrontBack frontBack = new FrontBack();

        System.out.println("Expected eodc -> returned: " + frontBack.frontBack("code"));
        System.out.println("Expected a -> returned: " + frontBack.frontBack("a"));
        System.out.println("Expected ba -> returned: " + frontBack.frontBack("ab"));
    }
}
