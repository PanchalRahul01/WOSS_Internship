/*Write a program to reverse the given number
Input Data: 2346
Expected Output: 6432*/

package PracticeProg;

public class prac6 {

    public static void main(String[] args) {

        int data=2346;
        int tempdata=0;

        while(data>0){
            int rem=data%10;
            tempdata=tempdata*10+rem;
            data=data/10;
        }

        System.out.println("Reverse:"+tempdata);

    }
}
