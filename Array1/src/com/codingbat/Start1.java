package com.codingbat;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

public class Start1 {

    public int start1(int[] a, int[] b) {
        int aCount;
        int bCount;

        if (a.length == 0 || a[0] != 1) {
            aCount = 0;
        } else {
            aCount = 1;
        }

        if (b.length == 0 || b[0] != 1) {
            bCount = 0;
        } else {
            bCount = 1;
        }
        return aCount + bCount;
    }
}
