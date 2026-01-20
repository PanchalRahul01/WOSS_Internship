/*Write a program to find duplicate numbers in given array, without using collections
Input Data: {3,56,12,45,34,56,12,78,56}
Expected Output: 56,12*/

package PracticeProg;

import java.util.HashMap;
import java.util.HashSet;

public class prac9 {

    public static void findduplicate(int[] arr){


        for(int i=0;i<arr.length;i++){

            if(arr[i]==-1){
                continue;
            }
            boolean value=false;

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    value=true;
                    arr[j]=-1;
                }

            }

            if(value){
                System.out.println(arr[i]);
            }


        }
    }




    public static void main(String[] args) {
        int[] arr={3,56,12,45,34,56,12,78,56};
        findduplicate(arr);

    }
}
