package com.codingbat;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 */

public class MissingChar {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public static void main(String[] args) {
        MissingChar missingChar =  new MissingChar();

        System.out.println("Expected ktten -> returned: " + missingChar.missingChar("kitten", 1));
        System.out.println("Expected itten -> returned: " + missingChar.missingChar("kitten", 0));
        System.out.println("Expected kittn -> returned: " + missingChar.missingChar("kitten", 4));
    }

}
