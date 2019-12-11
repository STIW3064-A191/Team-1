package com.teamB1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelandConsonant {
    String string;

    String result;

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    public String getResult() {
        List<Character> vowel = new ArrayList<Character>();
        List<Character>consonant = new ArrayList<Character>();
        for(int i = 0 ; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ||
                    string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U') {

                vowel.add(string.charAt(i));
            } else if (Character.isDigit(string.charAt(i))) {

            } else if (string.charAt(i) == ' ') {

            } else {
                consonant.add(string.charAt(i));
            }
        }
            Object[] vowelArray = vowel.toArray();
            Object[] consonantArray = consonant.toArray();
            result="Input: "+string+"\nOutput: \nVowel "+Arrays.toString(vowelArray)+"\nConsonant " + Arrays.toString(consonantArray);
        return result;
    }
}
