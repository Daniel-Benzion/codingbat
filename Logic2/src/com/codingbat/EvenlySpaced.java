package com.codingbat;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public class EvenlySpaced {

    public int smallFinder(int a, int b, int c) {
        if (a < b && a < c) return a;
        if (b < c && b < a) return b;
        return c;
    }

    public int largeFinder(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > c && b > a) return b;
        return c;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small;
        int medium;
        int large;

        small = smallFinder(a, b, c);
        large = largeFinder(a, b, c);
        if (a != small && a != large) {
            medium = a;
        } else if (b != small && b != large) {
            medium = b;
        } else {
            medium = c;
        }

        return medium - small == large - medium;
    }
}
