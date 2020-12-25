package com.codingbat;

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

public class Last2 {

    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int counter = 0;
        String endSub = str.substring(str.length() - 2);
        int i = 0;

        while (i < str.length() - 2) {
            if (str.substring(i, i + 2).equals(endSub)) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static void main(String[] args) {

        Last2 last2 = new Last2();
        System.out.println("Expected 1 -> returned: " + last2.last2("hixxhi"));
        System.out.println("Expected 1 -> returned: " + last2.last2("xaxxaxaxx"));
        System.out.println("Expected 2 -> returned: " + last2.last2("axxxaaxx"));
    }
}