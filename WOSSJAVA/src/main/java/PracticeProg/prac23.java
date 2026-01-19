package PracticeProg;
import java.util.HashMap;
import java.util.Scanner;
public class prac23 {

    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=Sc.nextLine();

        String[] str1=str.split(" ");

        HashMap<String,Integer> map=new HashMap<>();

        for(String s: str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s: map.keySet()){
            System.out.println(s+" "+map.get(s));
        }

    }
}
