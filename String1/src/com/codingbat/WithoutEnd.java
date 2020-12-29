package com.codingbat;

/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */

public class WithoutEnd {

    public String withoutEnd(String str) {

        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
