/*Write a program to partition an given array of integers into even numbers first and odd
numbers second. int [] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
Expected Output: {10, 2, 4, 2, 8, 6, 5, 3, 1, 7}*/

package PracticeProg;

import java.util.Arrays;

public class prac12 {

    public static void main(String[] args) {

        int [] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10,8};
        int[] result=new int[nums.length];
        int k=0;

        int j=nums.length-1;
        for(int i=0;i<=nums.length/2;i++){
                if(nums[i]%2!=0 && nums[j]%2==0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j--;
                }
        }
        System.out.println(Arrays.toString(nums));
    }
}
