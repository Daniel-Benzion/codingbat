package com.codingbat;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */

public class StringYak {

    public String stringYak(String str) {
        String result ="";
        int end;
        if(str.length() > 3) {
            for(int i=0; i < str.length(); i++) {
                end = i + 3;
                if(end > str.length()) {
                    end = str.length();
                }
                if(str.substring(i,end).equals("yak")) {
                    i=i+2;
                } else {
                    result += str.substring(i,i+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        StringYak stringYak = new StringYak();
        System.out.println("Expected pak -> returned: " + stringYak.stringYak("yakpak"));
        System.out.println("Expected pak -> returned: " + stringYak.stringYak("pakyak"));
        System.out.println("Expected 123ya -> returned: " + stringYak.stringYak("yak123ya"));
    }
}
