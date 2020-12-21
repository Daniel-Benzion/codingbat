package com.codingbat;

public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public static void main(String[] args) {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        System.out.println("Expected: true -> returned: " + monkeyTrouble.monkeyTrouble(true, true));
        System.out.println("Expected: true -> returned: " + monkeyTrouble.monkeyTrouble(false, false));
        System.out.println("Expected: false -> returned: " + monkeyTrouble.monkeyTrouble(true, false));
        System.out.println("Expected: false -> returned: " + monkeyTrouble.monkeyTrouble(false, true));
    }
}
