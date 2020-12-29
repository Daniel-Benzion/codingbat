package com.codingbat;

/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */

public class NonStart {

    public String nonStart(String a, String b) {
        String aMod = "";
        String bMod = "";
        for (int i = 1; i < a.length(); i++) {
            aMod += a.charAt(i);
        }
        for (int j = 1; j < b.length(); j++) {
            bMod += b.charAt(j);
        }
        return aMod + bMod;
    }
}
