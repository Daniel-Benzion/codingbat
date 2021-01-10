/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class EndOther {
    public boolean endOther(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        if (a1.length() > b1.length()) return b1.equals(a1.substring(a1.length() - b1.length()));
        return a1.equals(b1.substring(b1.length() - a1.length()));
    }
}
