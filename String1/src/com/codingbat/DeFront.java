package com.codingbat;

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class DeFront {

    public String deFront(String str) {
        boolean cond1 = str.charAt(0) == 'a' && str.charAt(1) == 'b';
        boolean cond2 = str.charAt(0) == 'a' && str.charAt(1) != 'b';
        boolean cond3 = str.charAt(0) != 'a' && str.charAt(1) == 'b';

        if (cond1) {
            return str;
        } else if (cond2) {
            String result = "";
            result += str.charAt(0);
            return result + str.substring(2);
        } else if (cond3) {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }
}
