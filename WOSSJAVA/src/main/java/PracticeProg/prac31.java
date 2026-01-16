/*Develop a command line calculator which supports addition, subtraction, division
multiplication & average. Also show the proper error message. In division if 2nd number
is zero then show an error message “Division by zero is not allowed”.
Expected Output :
Choose Operations
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Average
6. Exit
Choose Operation : 2
Enter numbers by comma separated:
        34, 34, 54, 65, 76
Your answer is : -195
Operations
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Average
6. Exit
Choose Operation : 4
Enter only two numbers by comma separated:*/

package PracticeProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prac31 {


    public static void Op(String str,int op) {

        String[] arr = str.split(",");

        try {

            int[] nums = new int[arr.length];
            for (int i = 0; i < arr.length; i++)
            {
                nums[i] = Integer.parseInt(arr[i].trim());

            }

            int res = 0;
            int res1 = 1;
            switch (op) {
                case 1:
                    for(int i:nums) res += nums[i];
                    System.out.println("Your Answer is: " + res);
                    break;
                case 2:
                    res=nums[0];
                    for ( int i=1; i<nums.length; i++ ) {
                        res-=nums[i];
                    }
                    System.out.println("Your Answer is: " + res);
                    break;
                case 3:
                     for(int i:nums) res-=nums[i];
                     System.out.println("Your Answer is: " + res);
                     break;
                case 4:
                    if(nums.length==2){
                        System.out.println("Enter only two numbers");
                        return;
                    }
                    if(nums[1]==0){
                        System.out.println("Divisable by zero not allow");
                        return;
                    }

                    System.out.println("Your Answer is: " + nums[0]/nums[1]);
                    break;
                case 5:
                    for(int i:nums) res+=nums[i];
                    float avg=res/nums.length;
                    System.out.println("Your Answer is: " + avg);
                    break;
            }


        }
        catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        while(true){

            System.out.println("Operations:->");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Average");
            System.out.println("6. Exit");
            System.out.print("Choose Operation: ");
            int op = sc.nextInt();
            System.out.println();

            sc.nextLine();

            if(op==6) {
                return;
            } else if (op==4) {
                System.out.println("Enter 2 numbers by comma separated: ");
                String str = sc.nextLine();
                Op(str,op);
            } else {
                System.out.println("Enter numbers by comma separated: ");
                String str1 = sc.nextLine();
                Op(str1,op);
            }


        }
    }
}
