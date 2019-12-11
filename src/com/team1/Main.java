package com.team1;

import com.teamA1.palindrome;
import com.teamB1.VowelandConsonant;
import com.teamC1.Alphabet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int choice;
        int exit=1;
        while(exit!=0){
            System.out.print("1-Check Palindrome number\n2-Extract Vowel and Consonant\n3-Extract Alphabet\n0-exit\n");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    palindrome palindrome=new palindrome();
                    System.out.print("Enter number: ");
                    int num=sc.nextInt();
                    palindrome.setNum(num);
                    System.out.println(palindrome.getResult()+"\n");
                    break;
                case 2:
                    VowelandConsonant vc =new VowelandConsonant();
                    System.out.print("Enter string: ");
                    String string=sc.next();
                    vc.setString(string);
                    System.out.println(vc.getResult()+"\n");
                    break;
                case 3:
                    System.out.print("Enter string: ");
                    Alphabet alphabet=new Alphabet();
                    String str=sc.next();
                    alphabet.setStr(str);
                    System.out.println(alphabet.getResult()+"\n");
                    break;
                case 0:
                    exit=0;
                    break;
                default:
                    System.out.println("Please enter your choice according to the command provided\n");
            }
        }
    }
}
