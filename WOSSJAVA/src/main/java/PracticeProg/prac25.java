/*Write a program to count the letters, spaces, numbers and other characters of an input
string.
        Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6*/

        package PracticeProg;

import java.util.Scanner;

public class prac25 {



    public static void main(String[] args) {

        String str="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int lettercount=0;
        int spacecount=0;
        int numbercount=0;
        int othercount=0;

        for(char ch:str.toCharArray()){
            if(Character.isSpaceChar(ch)){
                spacecount++;
            }
            else if(Character.isDigit(ch)){
                numbercount++;
            }
            else if(Character.isLetter(ch)){
                lettercount++;
            }
            else {
                othercount++;
            }
        }
        System.out.println("Number of letters: "+numbercount);
        System.out.println("Space count: "+spacecount);
        System.out.println("Letter count: "+lettercount);
        System.out.println("Other count: "+othercount);
    }
}
