/*Write a program to reverse a sentence.
Input Data: The quick brown fox
Expected Output: xof nworb kciuq ehT*/

package PracticeProg;


import java.util.Arrays;

public class prac24 {

    public static void main(String[] args) {
        String str= "The quick brown fox";
        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                sb.append(" ");
            }
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());

    }
}
