package com.codingbat;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class WithoutX2 {

    public String withoutX2(String str) {

        if (str.isEmpty() || str.equals("x")) {
            return "";
        }

        boolean cond1 = (str.charAt(0) == 'x' && str.charAt(1) == 'x');
        boolean cond2 = (str.charAt(0) == 'x' && str.charAt(1) != 'x');
        boolean cond3 = (str.charAt(0) != 'x' && str.charAt(1) == 'x');

        if (cond1) {
            return str.substring(2);
        } else if (cond2) {
            return str.substring(1);
        } else if (cond3) {
            String result = "";
            result += str.charAt(0);
            return result + str.substring(2);
        } else {
            return str;
        }
    }
}
