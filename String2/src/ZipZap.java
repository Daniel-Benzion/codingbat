/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

public class ZipZap {

    public String zipZap(String str) {
        if (str.length() < 3) return str;
        int i = 0;
        String result = "";
        while (i < str.length() - 2) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        result += str.substring(i);
        return result;
    }
}
