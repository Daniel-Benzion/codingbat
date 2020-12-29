package com.codingbat;

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */

public class LastTwo {

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String last = "";
        last += str.charAt(str.length() - 1);
        last += str.charAt(str.length() - 2);
        return str.substring(0, str.length() - 2) + last;
    }
}
