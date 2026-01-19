/*Update above program to find 2nd Max & 2nd Min without collection & sorting.*/

package PracticeProg;

public class prac5 {

    public static void find2nd(int[] arr){
        int min=arr[0];
        int secmin=arr[0];
        int max=arr[0];
        int secmax=arr[0];

        //
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secmin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<secmin){
                secmin=arr[i];
            }

            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>secmax) {
                secmax=arr[i];
            }
        }

        System.out.println(secmin+" "+secmax);
    }
    public static void main(String[] args) {

        int[] arr={4,5,3,6,7,8,9,1};
        find2nd(arr);
    }
}
