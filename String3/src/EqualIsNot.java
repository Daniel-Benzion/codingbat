/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

public class EqualIsNot {

    public boolean equalIsNot(String str) {
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("is")) counter1++;
        }

        for (int j = 0; j < str.length() - 2; j++) {
            if (str.substring(j, j + 3).equals("not")) counter2++;
        }

        return counter1 == counter2;
    }
}
