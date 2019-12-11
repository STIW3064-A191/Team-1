package com.teamC1;

public class Alphabet {
    String str;
    String result;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getResult() {
        for (int i = 0; i < str.length(); i++)
        {
            // Finding the character whose ASCII value fall under this range
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z'){
                // Erase function to erase the character
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        result="Input: "+str+"\nOutput: "+str;
        return result;
    }
}
