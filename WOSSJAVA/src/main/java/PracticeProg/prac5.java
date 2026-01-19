/*Update above program to find 2nd Max & 2nd Min without collection & sorting.*/

package PracticeProg;

public class prac5 {

    public static void find2ndMin_Max(int[] arr){
        int min=arr[0];
        int secMin=arr[0];
        int max=arr[0];
        int secMax=arr[0];

        //loop for 1  to n of the array
        for(int i=0;i<arr.length;i++){
            //check for the Second Minimum
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<secMin){
                secMin=arr[i];
            }
            //check for the Second Maximum
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>secMax) {
                secMax=arr[i];
            }
        }

        System.out.println(secMin+" "+secMax);
    }
    public static void main(String[] args) {

        int[] arr={4,5,3,6,7,8,9,1};
        find2ndMin_Max(arr);
    }
}
