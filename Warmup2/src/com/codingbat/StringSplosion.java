package com.codingbat;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */

public class StringSplosion {

    public String stringSplosion(String str) {
        String sploder = "";
        String result = "";
        int i = 0;

        while (i < str.length()) {
            sploder += str.charAt(i);
            result += sploder;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        StringSplosion stringSplosion = new StringSplosion();
        System.out.println("Expected CCoCodCode -> returned: " + stringSplosion.stringSplosion("Code"));
        System.out.println("Expected aababc -> returned: " + stringSplosion.stringSplosion("abc"));
        System.out.println("Expected aab -> returned: " + stringSplosion.stringSplosion("ab"));
    }
}
