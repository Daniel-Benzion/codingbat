package com.codingbat;

/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */

public class MinCat {

    public String minCat(String a, String b) {

        if (a.isEmpty() || b.isEmpty()) {
            return "";
        }

        if (a.length() == b.length()) {
            return a + b;
        }

        int medium;

        if (a.length() < b.length()) {
            medium = (b.length() - a.length());
            return a + b.substring(medium);
        } else {
            medium = (a.length() - b.length());
            return a.substring(medium) + b;
        }
    }
}
