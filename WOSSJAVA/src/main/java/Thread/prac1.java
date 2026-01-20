/*1. Write a program that executes two threads. One thread will print the even numbers and
another thread will print odd numbers from 1 to 50.*/

package Thread;


//Thread For THe Even Number
class EvenTask extends Thread{

    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even:"+i);
            }
        }
    }
}

//Thread For Odd Number
class OddTask extends Thread{

    public void run(){
        System.out.println();
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println("Odd:"+i);
            }
        }
    }
}

public class prac1 {

    public static void main(String[] args) {

        OddTask odd=new OddTask();
        EvenTask even=new EvenTask();

        odd.start();
        even.start();
    }
}
