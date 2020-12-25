package com.codingbat;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */

public class StringBits {

    public String stringBits(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            result += str.charAt(i);
            i += 2;
        }
        return result;
    }

    public static void main(String[] args) {

        StringBits stringBits = new StringBits();
        System.out.println("Expected Hlo -> returned: " + stringBits.stringBits("Hello"));
        System.out.println("Expected H -> returned: " + stringBits.stringBits("Hi"));
        System.out.println("Expected Hello -> returned: " + stringBits.stringBits("Heeololeo"));
    }
}
