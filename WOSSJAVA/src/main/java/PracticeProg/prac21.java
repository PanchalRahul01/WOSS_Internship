/*Write a program to count and display frequency of letters and digits from the String given
by the user as a command-line argument.*/
package PracticeProg;

import java.util.Scanner;

public class prac21 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Etner the String ::");
            String str=sc.nextLine();
            int countletter=0;
            int countdigit=0;

            for(char ch: str.toCharArray()){
                if(Character.isLetter(ch)){
                    countletter++;
                }
                if(Character.isDigit(ch)){
                    countdigit++;
                }
            }


            System.out.println("letter"+countletter+"Digit"+countdigit);
        }


}
