package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class ArrayList1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List"+list);

        System.out.print("Enter the value replace :");
        int index=sc.nextInt();

        if(list.contains(index)){
            int x=list.indexOf(index);

            System.out.print("Enter the new value :");
            int val=sc.nextInt();
            list.set(x,val);
            System.out.println("Updated List :"+list);
        }
        else{
            System.out.println("Element Not Found");
        }


    }
}
