/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
 */

public class SumDigits {

    public int sumDigits(String str) {
        int counter = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) temp += str.charAt(i);
        }

        if (temp.isEmpty()) return 0;

        int tempInt = Integer.parseInt(temp);

        while (tempInt > 0) {
            counter += tempInt % 10;
            tempInt /= 10;
        }

        return counter;
    }
}
