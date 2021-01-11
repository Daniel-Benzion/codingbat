/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

 */

public class XyzMiddle {

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;

        int startBoth = (str.length() / 2) - 1;
        int startEven = (str.length() / 2) - 2;

        boolean xyz = str.substring(startBoth, startBoth + 3).equals("xyz");
        if (str.length() % 2 == 0) {
            return (str.substring(startEven, startEven + 3).equals("xyz")) || xyz;
        }
        return xyz;
    }
}
