/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        if (count == 1) return word;

        int i = 1;
        String result = word;

        do {
            result += sep;
            result += word;
            i++;
        } while (i < count);
        return result;
    }
}
