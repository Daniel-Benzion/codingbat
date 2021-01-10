/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class MixString {

    public String mixString(String a, String b) {
        String result = "";
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                result += a.charAt(i);
                result += b.charAt(i);
            }
            return result;
        }

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        if (a.length() > b.length()) result += a.substring(min);
        if (b.length() > a.length()) result += b.substring(min);
        return result;
    }
}
