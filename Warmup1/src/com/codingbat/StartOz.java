package com.codingbat;

/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public class StartOz {

    public String startOz(String str) {
        if (str.isEmpty()) {
            return "";
        } else if ((str.length() == 1) && (str.charAt(0) == 'o')) {
            return str;
        } else if ((str.length() == 1) && (str.charAt(0) != 'o')) {
            return "";
        } else if (str.indexOf("oz") == 0) {
            return "oz";
        } else if (str.charAt(1) == 'z') {
            return "z";
        } else if (str.charAt(0) == 'o') {
            return "o";
        }
        return "";
    }

    public static void main(String[] args) {

        StartOz startOz = new StartOz();
        System.out.println("Expected oz -> returned: " + startOz.startOz("ozymandias"));
        System.out.println("Expected z -> returned: " + startOz.startOz("bzoo"));
        System.out.println("Expected o -> returned: " + startOz.startOz("oxx"));
        System.out.println("Expected o -> returned: " + startOz.startOz("o"));
        System.out.println("Expected '' -> returned: " + startOz.startOz("a"));
        System.out.println("Expected '' -> returned: " + startOz.startOz("z"));
        System.out.println("Expected '' -> returned: " + startOz.startOz(""));
        System.out.println("Expected '' -> returned: " + startOz.startOz("zo"));
    }
}
