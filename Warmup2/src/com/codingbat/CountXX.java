package com.codingbat;

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class CountXX {

    int countXX(String str) {
        int win1 = 0;
        int win2 = 1;
        int counter = 0;

        while(win2 < str.length()) {
            if (str.charAt(win1) == 'x' && str.charAt(win2) == 'x') {
                counter++;
            }
            win1++;
            win2++;
        }
        return counter;
    }

    public static void main(String[] args) {

        CountXX countXX = new CountXX();
        System.out.println("Expected 1 -> returned: " + countXX.countXX("abcxx"));
        System.out.println("Expected 2 -> returned: " + countXX.countXX("xxx"));
        System.out.println("Expected 3 -> returned: " + countXX.countXX("xxxx"));
    }
}
