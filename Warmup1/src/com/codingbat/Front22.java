package com.codingbat;

/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class Front22 {

    public String front22(String str) {

        String first;

        if (str.isEmpty()) {
            return "";
        } else if (str.length() < 2) {
            return str + str + str;
        } else {
            first = str.substring(0, 2);
        }
        return first + str + first;
    }

    public static void main(String[] args) {

        Front22 front22 = new Front22();
        System.out.println("Expected kikittenki -> returned: " + front22.front22("kitten"));
        System.out.println("Expected HaHaHa -> returned: " + front22.front22("Ha"));
        System.out.println("Expected ababcab -> returned: " + front22.front22("abc"));
    }
}
