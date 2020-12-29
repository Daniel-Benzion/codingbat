package com.codingbat;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */

public class WithoutX {

    public String withoutX(String str) {

        if (str.isEmpty() || str.substring(0) == "x" || str.substring(0) == "xx") {
            return "";
        }


        boolean cond1 = str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x';
        boolean cond2 = str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x';
        boolean cond3 = str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x';

        if (cond1) {
            return str.substring(1, str.length() - 1);
        } else if (cond2) {
            return str.substring(1);
        } else if (cond3) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
