/*Write a program to find unique numbers in given array, without using collections
Input Data: {3,56,12,45,34,56,12,78,56}
Expected Output: 3,45,34,78*/

package PracticeProg;

import java.util.HashMap;

public class prac10 {

    public static void findUnique(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


//        for(int key:map.keySet()){
//            System.out.println(key+"->"+map.get(key));
//        }

        for(int key:map.keySet()){
            if(map.get(key)==1){
                System.out.print(key+",");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,56,12,45,34,56,12,78,56};
        findUnique(arr);
    }
}
