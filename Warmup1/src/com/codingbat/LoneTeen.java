package com.codingbat;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */

public class LoneTeen {

    public boolean loneTeen(int a, int b) {

        return ((a >= 13 && a <= 19) && (b < 13 || b > 19)) || ((b >= 13 && b <= 19) && (a < 13 || a > 19));
    }

    public static void main(String[] args) {

        LoneTeen loneTeen = new LoneTeen();
        System.out.println("Expected true -> returned: " + loneTeen.loneTeen(13, 99));
        System.out.println("Expected true -> returned: " + loneTeen.loneTeen(21, 19));
        System.out.println("Expected false -> returned: " + loneTeen.loneTeen(13, 13));
    }
}
