package PracticeProg;
import java.util.*;



public class prac19 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the digit of the Number:");
        int n=sc.nextInt();


        int[] digit=new int[n];

        System.out.println("Enter the Digit :");
        for(int i=0;i<n;i++){
            digit[i]=sc.nextInt();
        }

        Arrays.sort(digit);

        int small=0;
        int big=0;

        for(int i=0;i<n;i++){
            small=small*10+digit[i];
        }
        for(int i=n-1;i>=0;i--){
            big=big*10+digit[i];
        }

        System.out.println();

        System.out.println("Smallest Number:"+small);
        System.out.print("Largest Number:"+big);




    }
}
