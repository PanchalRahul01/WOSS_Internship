/*Write a program that create and runs following threads:
i. print "A" 20 times
ii. print "B" 30 times
iii. print "C" 15 times*/
package Thread;

class PrintA extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("A");
        }
    }
}

class PrintB extends Thread{
    public void run(){
        for(int i=1;i<=30;i++){
            System.out.println("B");
        }
    }
}

class PrintC extends Thread{
    public void run(){
        for(int i=1;i<=15;i++){
            System.out.println("C");
        }
    }
}

public class prac2 {

    public static void main(String[] args) {

        PrintA threadA=new PrintA();
        PrintB threadB=new PrintB();
        PrintC threadC=new PrintC();

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
