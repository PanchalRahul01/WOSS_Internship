/*4. Write a program to find maximum and minimum numbers from a given list of numbers
without collection & sorting.*/

package PracticeProg;
public class prac4 {

    public static void findMin_Max(int[] arr){

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>min){}
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("min="+min+" max="+max);

    }
    public static void main(String[] args) {

        int[] arr={10,2,4,5,-6,7};

        findMin_Max(arr);

    }

}
