package com.codingbat;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {

    public String frontTimes(String str, int n) {
        String result = "";
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() < 3) {
            while (n > 0) {
                result += str;
                n--;
            }
            return result;
        }
        while(n > 0) {
            result += str.substring(0, 3);
            n--;
        }
        return result;
    }

    public static void main(String[] args) {

        FrontTimes frontTimes = new FrontTimes();
        System.out.println("Expected ChoCho -> returned: " + frontTimes.frontTimes("Chocolate", 2));
        System.out.println("Expected ChoChoCho -> returned: " + frontTimes.frontTimes("Chocolate", 3));
        System.out.println("Expected AbcAbcAbc -> returned: " + frontTimes.frontTimes("Abc", 3));
    }
}
