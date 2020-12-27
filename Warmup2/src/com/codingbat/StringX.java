package com.codingbat;

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x' || (str.charAt(i) == 'x' && ((i == 0) || (i == str.length() - 1)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        StringX stringX = new StringX();
        System.out.println("Expected xHix -> returned: " + stringX.stringX("xxHxix"));
        System.out.println("Expected abcd -> returned: " + stringX.stringX("abxxxcd"));
        System.out.println("Expected xabcdx -> returned: " + stringX.stringX("xabxxxcdx"));
    }
}
