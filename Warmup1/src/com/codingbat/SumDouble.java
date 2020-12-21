package com.codingbat;

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.

public class SumDouble {

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public static void main(String[] args) {

        SumDouble sumDouble = new SumDouble();
        System.out.println("Expected 3 -> returned: " + sumDouble.sumDouble(1, 2));
        System.out.println("Expected 5 -> returned: " + sumDouble.sumDouble(3, 2));
        System.out.println("Expected 8 -> returned: " + sumDouble.sumDouble(2, 2));
    }
}
