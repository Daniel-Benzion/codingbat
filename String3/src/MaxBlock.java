/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

public class MaxBlock {

    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;

        if (str.length() == 1) return 1;

        int counter = 1;
        int max = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            char blockBase = str.charAt(i);

            if (str.charAt(i + 1) != blockBase) {
                counter = 1;
                continue;
            }

            if (str.charAt(i + 1) == blockBase) {
                counter++;
                if (max < counter) {
                    max = counter;
                }
            }
        }
        return max;
    }
}
