package com.codingbat;

/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */

import java.util.Collections;
import java.util.Arrays;

public class IntMax {

    public int intMax(int a, int b, int c) {
        return Collections.max(Arrays.asList(a, b, c));
    }

    public static void main(String[] args) {

        IntMax intMax = new IntMax();
        System.out.println("Expected 3 -> returned: " + intMax.intMax(1, 2, 3));
        System.out.println("Expected 3 -> returned: " + intMax.intMax(1, 3, 2));
        System.out.println("Expected 3 -> returned: " + intMax.intMax(3, 2, 1));
    }
}
