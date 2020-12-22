package com.codingbat;

/*

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */

public class Front3 {

    public String front3(String str) {

        String first;

        if (str.isEmpty()) {
            return "";
        }else if (str.length() == 1) {
            first = str.substring(0, 1);
        } else if (str.length() == 2) {
            first = str.substring(0, 2);
        } else {
            first = str.substring(0, 3);
        }

        return first + first + first;
    }


    public static void main(String[] args) {
        Front3 front3 = new Front3();

        System.out.println("Expected JavJavJav -> returned: " + front3.front3("Java"));
        System.out.println("Expected ChoChoCho -> returned: " + front3.front3("Chocolate"));
        System.out.println("Expected abcabcabc -> returned: " + front3.front3("abc"));
        System.out.println("Expected ababab -> returned: " + front3.front3("ab"));
        System.out.println("Expected aaa -> returned: " + front3.front3("a"));
        System.out.println("Expected '' -> returned: " + front3.front3(""));
    }
}
