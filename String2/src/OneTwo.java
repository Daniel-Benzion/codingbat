/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public class OneTwo {

    public String oneTwo(String str) {
        if (str.length() < 3) return "";
        int i = 0;
        String result = "";
        while (i < str.length() - 2) {
            result += str.substring(i + 1, i + 3);
            result += str.charAt(i);
            i += 3;
        }
        return result;
    }
}
