package com.codingbat;

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */

public class Close10 {

    public int close10(int a, int b) {
        int a10 = Math.abs(10 - a);
        int b10 = Math.abs(10 - b);
        if (a10 == b10) {
            return 0;
        } else if (a10 < b10){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {

        Close10 close10 = new Close10();
        System.out.println("Expected 8 -> returned: " + close10.close10(8, 13));
        System.out.println("Expected 8 -> returned: " + close10.close10(13, 8));
        System.out.println("Expected 0 -> returned: " + close10.close10(13, 7));
    }
}
