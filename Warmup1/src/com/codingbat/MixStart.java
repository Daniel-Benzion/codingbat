package com.codingbat;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */

public class MixStart {

    public boolean mixStart(String str) {

        return str.indexOf("ix") == 1;
    }

    public static void main(String[] args) {

        MixStart mixStart = new MixStart();
        System.out.println("Expected true -> returned: " + mixStart.mixStart("mix snacks"));
        System.out.println("Expected true -> returned: " + mixStart.mixStart("pix snacks"));
        System.out.println("Expected false -> returned: " + mixStart.mixStart("piz snacks"));
    }
}
