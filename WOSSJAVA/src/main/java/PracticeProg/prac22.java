/*Write a program to check if a given sentence has all unique words.*/

package PracticeProg;
import java.util.HashMap;
import java.util.Scanner;
public class prac22 {

    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=Sc.nextLine();

        boolean value=true;


        String[] arr=str.split(" ");

        HashMap<String,Integer> map=new HashMap<>();

        for (String s : arr) {

            map.put(s, map.getOrDefault(s, 0) + 1);

            if(map.get(s)>1){
                value=false;
                break;
            }

        }

        if(value){
            System.out.println("is unique");
        }else {
            System.out.println("Not Unique");
        }








    }
}
