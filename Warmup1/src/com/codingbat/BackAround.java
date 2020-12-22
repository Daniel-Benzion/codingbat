package com.codingbat;

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

public class BackAround {

    public String backAround(String str) {

        char last = str.charAt(str.length() - 1);

        if (str.length() == 1) {
            return str + str + str;
        }

        return last + str + last;
    }

    public static void main(String[] args) {

        BackAround backAround = new BackAround();
        System.out.println("Expected tcatt -> returned: " + backAround.backAround("cat"));
        System.out.println("Expected oHelloo -> returned: " + backAround.backAround("Hello"));
        System.out.println("Expected aaa -> returned: " + backAround.backAround("a"));
    }
}
