package com.codingbat;

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */

public class DelDel {

    public String delDel(String str) {
        if (str.indexOf("del") == 1) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

    public static void main(String[] args) {

        DelDel delDel = new DelDel();
        System.out.println("Expected abc -> returned: " + delDel.delDel("adelbc"));
        System.out.println("Expected aHello -> returned: " + delDel.delDel("adelHello"));
        System.out.println("Expected adedbc -> returned: " + delDel.delDel("adedbc"));
        System.out.println("Expected abcdel -> returned: " + delDel.delDel("abcdel"));
    }
}
