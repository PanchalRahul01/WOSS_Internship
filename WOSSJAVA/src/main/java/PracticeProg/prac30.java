/*Validate a given email address using regular expressions.
Input Data: mydata@abc.com
Expected Output: It’s valid email*/

package PracticeProg;

public class prac30 {


    public static void main(String[] args) {
        String str="mydata@abc.com";

        if(str.matches("^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]{2,}$")){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
