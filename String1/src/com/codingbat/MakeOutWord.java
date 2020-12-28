package com.codingbat;

/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */

public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static void main(String[] args) {

        MakeOutWord makeOutWord = new MakeOutWord();
        System.out.println("Expected <<Yay>> -> returned: " + makeOutWord.makeOutWord("<<>>", "Yay"));
        System.out.println("Expected <<WooHoo>> -> returned: " + makeOutWord.makeOutWord("<<>>", "WooHoo"));
        System.out.println("Expected [[word]] -> returned: " + makeOutWord.makeOutWord("[[]]", "word"));
    }
}
