package com.codingbat;

/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

 */

public class MiddleThree {

    public String middleThree(String str) {
        int middle = (int) Math.ceil(str.length() / 2);
        return str.substring(middle - 1, middle + 2);
    }

    public static void main(String[] args) {
        MiddleThree middleThree = new MiddleThree();
        System.out.println(middleThree.middleThree("Candy"));
        System.out.println(middleThree.middleThree("and"));
        System.out.println(middleThree.middleThree("solving"));
    }
}
