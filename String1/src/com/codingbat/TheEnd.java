package com.codingbat;

/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */

public class TheEnd {

    public String theEnd(String str, boolean front) {
        String result = "";
        if (front) {
            result += str.charAt(0);
        } else {
            result += str.charAt(str.length() - 1);
        }
        return result;
    }
}
