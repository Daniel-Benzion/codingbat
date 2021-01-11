/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

 */

public class GetSandwich {

    public String getSandwich(String str) {
        if (str.length() < 11) return "";
        int count = 0;
        int i = 0;
        int j = str.length() - 1;
        int firstIdx = 0;
        boolean first = false;
        int secondIdx = 0;
        boolean second = false;
        while (i < str.length() && !first) {
            if (str.substring(i, i + 5).equals("bread")) {
                firstIdx = i;
                count++;
                first = true;
            }
            i++;
        }
        while (j > firstIdx + 5 && !second) {
            if (str.substring(j - 4).equals("bread")) {
                secondIdx = j - 4;
                count++;
                second = true;
            } else {
                j--;
                if (str.substring(j - 4, j + 1).equals("bread")) {
                    secondIdx = j - 4;
                    count++;
                    second = true;
                }
            }
        }
        if (count < 2) return "";
        return str.substring(firstIdx + 5, secondIdx);
    }
}
