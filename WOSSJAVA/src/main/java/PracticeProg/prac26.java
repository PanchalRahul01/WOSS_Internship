// Write a program to extract digits and alphabets from the given string and sort them in
//ascending order.

package PracticeProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class prac26 {

    public static void main(String[] args) {
        String str="a3B1c9D";
        ArrayList<Character> digit=new ArrayList<>();
        ArrayList<Character>alphabet=new ArrayList<>();

        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                digit.add(ch);
            }
            else if(Character.isLetter(ch)){
                alphabet.add(ch);
            }
        }
        Collections.sort(digit);
        Collections.sort(alphabet);

        System.out.println(digit);
        System.out.println(alphabet);
    }
}
