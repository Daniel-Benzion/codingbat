/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public class StarOut {

    public String starOut(String str) {
        if (str.isEmpty() || (str.length() < 3 && str.indexOf('*') !=  -1)) return "";
        if (str.length() == 1) return str;
        int i = 1;
        String result = "";
        if (str.charAt(i - 1) != '*' && str.charAt(i) != '*') result += str.charAt(i - 1);
        while (i < str.length() - 1) {
            if (str.charAt(i) != '*' && str.charAt(i - 1) != '*' & str.charAt(i + 1) != '*') {
                result += str.charAt(i);
            }
            i++;
        }
        if (str.charAt(i - 1) != '*' && str.charAt(i) != '*') result += str.charAt(i);
        return result;
    }
}
