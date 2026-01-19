/*Write a program to swap two string variables without using a third or temp variable.*/
package PracticeProg;

public class prac8 {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "pqr";

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);

    }
}
