package com.codingbat;

/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */

public class IcyHot {

    public boolean icyHot(int temp1, int temp2) {

        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public static void main(String[] args) {

        IcyHot icyHot = new IcyHot();
        System.out.println("Expected true -> returned: " + icyHot.icyHot(120, -1));
        System.out.println("Expected true -> returned: " + icyHot.icyHot(-1, 120));
        System.out.println("Expected false -> returned: " + icyHot.icyHot(2, 120));
    }
}
