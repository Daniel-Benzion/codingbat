package com.codingbat;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {

    public String altPairs(String str) {
        String result = "";
        int i = 0;
        int plus3 = 1;
        while (i < str.length()) {
            result += str.charAt(i);
            if (plus3 % 2 != 0) {
                i++;
            } else {
                i += 3;
            }
            plus3++;
        }
        return result;
    }

    public static void main(String[] args) {

        AltPairs altPairs = new AltPairs();
        System.out.println("Expected kien -> returned: " + altPairs.altPairs("kitten"));
        System.out.println("Expected Chole -> returned: " + altPairs.altPairs("Chocolate"));
        System.out.println("Expected Congrr -> returned: " + altPairs.altPairs("CodingHorror"));
    }
}
