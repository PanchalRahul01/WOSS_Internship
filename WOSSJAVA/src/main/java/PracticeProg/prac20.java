package PracticeProg;

import java.util.Locale;

public class prac20 {

    private static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o';
    }

    public static void main(String[] args) {



        String str="Hello";

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            System.out.println(isVowel(str.charAt(i)));
        }

        for(char ch:str.toCharArray()){

            if(isVowel(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(sb.toString());

    }


}
