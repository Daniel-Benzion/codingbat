package com.codingbat;

/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */

public class MakeAbba {

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {

        MakeAbba makeAbba = new MakeAbba();
        System.out.println("Expected HiByeByeHi -> returned: " + makeAbba.makeAbba("Hi", "Bye"));
        System.out.println("Expected YoAliceAliceYo -> returned: " + makeAbba.makeAbba("Yo", "Alice"));
        System.out.println("Expected WhatUpUpWhat -> returned: " + makeAbba.makeAbba("What", "Up"));
    }
}
