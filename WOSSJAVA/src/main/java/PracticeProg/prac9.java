/*Write a program to find duplicate numbers in given array, without using collections
Input Data: {3,56,12,45,34,56,12,78,56}
Expected Output: 56,12*/

package PracticeProg;

import java.util.HashMap;
import java.util.HashSet;

public class prac9 {

    public static void findduplicate(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
     //   HashSet<Integer> set=new HashSet<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                System.out.print(key+",");
            }
        }
    }




    public static void main(String[] args) {
        int[] arr={3,56,12,45,34,56,12,78,56};
        findduplicate(arr);

    }
}
