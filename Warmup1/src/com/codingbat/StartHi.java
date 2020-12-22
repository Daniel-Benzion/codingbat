package com.codingbat;

/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public class StartHi {

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }

    public static void main(String[] args) {

        StartHi startHi = new StartHi();
        System.out.println("Expected true -> returned: " + startHi.startHi("hi there"));
        System.out.println("Expected true -> returned: " + startHi.startHi("hi"));
        System.out.println("Expected false -> returned: " + startHi.startHi("hello hi"));
    }
}
