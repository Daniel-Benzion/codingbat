package com.codingbat;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class DoubleX {

    public boolean doubleX(String str) {
        //iterator finds x  then checks iterator + 1 returns t/f
        int i = 0;

        while (i < str.length() - 1) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                return true;
            } else if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') {
                return false;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {

        DoubleX doubleX = new DoubleX();
        System.out.println("Expected true -> returned: " + doubleX.doubleX("axxbb"));
        System.out.println("Expected false -> returned: " + doubleX.doubleX("axaxax"));
        System.out.println("Expected true -> returned: " + doubleX.doubleX("xxxxx"));
    }
}
