package com.codingbat;

import java.lang.Math;

//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

public class Diff21 {

    public int diff21(int n) {

        if (n > 21) {
            return Math.abs(21 - n) * 2;
        }
        return Math.abs(21 - n);
    }

    public static void main(String[] args) {

        Diff21 diff21 = new Diff21();

        System.out.println("Expected 2 -> returned: " + diff21.diff21(19));
        System.out.println("Expected 11 -> returned: " + diff21.diff21(10));
        System.out.println("Expected 0 -> returned: " + diff21.diff21(21));
    }

}
