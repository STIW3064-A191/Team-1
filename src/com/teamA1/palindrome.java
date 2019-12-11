package com.teamA1;


public class palindrome implements java.io.Serializable{
    int num;
    String result;
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }
    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    /**
     * @return the result
     */
    public String getResult() {
        int reverse=0,remainder,temp;

        temp=num;
        while(temp!=0){
            remainder=temp%10;
            reverse =reverse*10+remainder;
            temp=temp/10;
        }
        if (num == reverse) // checking whether num is equal to reverse
            result="Input: "+num+"\nOutput: "+num+" is a palindrome.";
        else
            result="Input: "+num+"\nOutput: "+num+" is not a palindrome.";
        return result;
    }
}
