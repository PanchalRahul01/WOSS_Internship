/*1. Ask user to enter range and then choose number type odd or even numbers
        Expected Output :
        Start Number:
        End Number:
        Choose Number Type
        1) Odd
        2) Even*/

        package PracticeProg;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Start Number:");
        int startNum=sc.nextInt();
        System.out.print("End Number:");
        int endNum=sc.nextInt();
        System.out.println();
        System.out.println("Choose Number Type:");
        System.out.println("1)odd \n 2)Even");
        int choice=sc.nextInt();

        //Check the Start Number Is Less Than End Number
        if(startNum>endNum){
            System.out.println("Invalid Input");
        }


        //Switch Case For Odd And Even
        switch (choice)
        {
            case 1:
                System.out.print("odd Range:");
                for (int i=startNum; i<=endNum; i++){
                    if (i%2!=0){
                        System.out.print(i+"->");
                    }
                }
                break;
            case 2:
                System.out.print("Even Range:");
                for (int i=startNum; i<=endNum; i++){
                    if (i%2==0){
                        System.out.print(i+"->");
                    }
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
