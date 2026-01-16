package collections;

import javax.naming.InsufficientResourcesException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String msg) {
        super(msg);
    }
}



public class prac1 {


    public int balance;

    public LinkedList<String> list = new LinkedList<>();



    public void BankAccount(int initialAmount) {
        balance=initialAmount;
        list.add("Deposit Rs."+initialAmount);
    }

    public void deposite(int amount){
        balance=balance+amount;
        list.add("Deposit Rs."+amount+"Total"+balance);
    }

    public void withdraw(int amount){

        try{
            if(balance <amount){
                throw new InsufficientFundException("Insufficient Fund");
            }
            else if(amount<=0){
                throw new Exception("Amount not shoud be negative");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        balance=balance-amount;
        list.add("Withdraw Rs."+amount+"Total"+balance);
    }

    public void statment(){
        System.out.println(list.toString());
    }

    public void filter(int ch){
        for(String s : list){
            if(ch==1){
                System.out.println(s);
            }
            else if(ch==2 && s.toLowerCase().startsWith("withdraw")){
                System.out.println(s);
            }
            else if(ch==3 && s.toLowerCase().startsWith("deposit")){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        prac1 pr=new prac1();

        pr.BankAccount(1000);

        while(true){
            System.out.println("Operations");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.ViewStatement");
            System.out.println("4. Filter");
            System.out.println("5.Exit");

            System.out.print("Enter your choice: ");
            int option=sc.nextInt();


            switch (option){
                case 1:
                    System.out.println("Enter Amount to Deposit");
                    int amount=sc.nextInt();
                    pr.deposite(amount);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw");
                    try{
                        int amount2=sc.nextInt();
                        pr.withdraw(amount2);
                    }catch (InsufficientFundException e){
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 3:
                    System.out.println("Your Statement");
                    pr.statment();
                    break;
                case 4:
                    System.out.println("Enter Your Choice (1.All / 2.Withdraw / 3.Deposit)");
                    int ch=sc.nextInt();
                    pr.filter(ch);
                    break;
                case 5:
                    return;


            }

        }


    }

}
