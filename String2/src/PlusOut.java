/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public class PlusOut {

    public String plusOut(String str, String word) {
        String result = "";
        int i = 0;
        int end = 0;
        int sLen = str.length();
        while(i < sLen) {
            end = i + word.length();
            if(end > sLen) {
                end = sLen;
            }
            if(str.substring(i, end).equals(word)) {
                result += word;
                i += word.length();
            }
            else {
                result += "+";
                i++;
            }
        }
        return result;
    }
}
