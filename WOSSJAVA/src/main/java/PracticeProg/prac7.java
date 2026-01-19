/*Write a program to sum the digits of a given number.
Input Data: 2346
Expected Output: 15*/

package PracticeProg;

public class prac7 {
    public static void main(String[] args) {
        int data=2346;
        int sum=0;

        while(data>0){
            int rem=data%10;
            sum=sum+rem;
            data=data/10;
        }

        System.out.println("Sum is:"+sum);
    }
}
