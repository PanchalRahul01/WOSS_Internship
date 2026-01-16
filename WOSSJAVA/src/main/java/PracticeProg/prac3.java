//3. Write a program to print the Fibonacci series up to a given number.
package PracticeProg;

import java.util.Scanner;

public class prac3 {

    public static void fibbo(int n,int a,int b){
        if(n==0) return;
        int c=a+b;
        System.out.print(c+"->");
        fibbo(n-1,b,c);

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Fibonacci Series Range: ");
        int n=sc.nextInt();
        int num1=0;
        int num2=1;

        System.out.print("Range: 0->1->");
        fibbo(n-2,num1,num2);


    }
}
