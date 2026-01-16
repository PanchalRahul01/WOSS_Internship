/*Write a program to find the numbers greater than the average of the numbers of a given
array. Int[] nums = {1, 4, 17, 7, 25, 3, 100};
Expected Output:
The average is: 22.0
The numbers in the said array that are greater than the average are:
        25
        100*/

package PracticeProg;

public class prac11 {

    public static void main(String[] args) {

        int[] nums={1, 4, 17, 7, 25, 3, 100};
        float avg=0f,sum=0f;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        avg=sum/nums.length;
        System.out.println("the average is "+avg);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>avg){
                System.out.print(nums[i]+",");
            }
        }



    }

}
