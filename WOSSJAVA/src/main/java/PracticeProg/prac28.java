/*Write a program to check whether two given strings are anagram or not. Two strings are
said to be anagram if they contain the same set of characters but in different order. For
example, “Mother In Law” and “Hitler Woman” are anagrams*/

package PracticeProg;

import java.util.Arrays;

public class prac28 {
    public static void main(String[] args) {
        String str1 = "Mother In Law".replaceAll(" ", "").toLowerCase();
        String str2 = "Hitler Woman".replaceAll(" ", "").toLowerCase();


        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);



        if (Arrays.equals(ch1,ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}
