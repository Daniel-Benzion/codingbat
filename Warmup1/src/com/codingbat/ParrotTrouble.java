package com.codingbat;

/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 */

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        boolean isLate = (hour < 7 || hour > 20);
        return talking && isLate;
    }

    public static void main(String[] args) {

        ParrotTrouble parrotTrouble = new ParrotTrouble();
        System.out.println("Expected true -> returned: " + parrotTrouble.parrotTrouble(true, 6));
        System.out.println("Expected false -> returned: " + parrotTrouble.parrotTrouble(true, 7));
        System.out.println("Expected false -> returned: " + parrotTrouble.parrotTrouble(false, 6));
    }
}
