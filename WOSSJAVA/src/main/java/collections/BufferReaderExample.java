package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Student{
    int id;
    String name;
    int age;

    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}


public class BufferReaderExample {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(isr);

        ArrayList<Student> list=new ArrayList<Student>();

        String name="aBBD";


        try{

            while(true){

                System.out.println("Details:");
                System.out.print("Enter the ID:");
                int id=Integer.parseInt(reader.readLine());
                System.out.println();
                System.out.print("Enter the Name:");
                String sname=reader.readLine();
                System.out.println();
                System.out.print("Enter the Age:");
                int age=Integer.parseInt(reader.readLine());
                System.out.println();

                Student s=new Student(id,sname,age);

                list.add(s);

                System.out.println("Do you want to add another record?(yes/no):");
                String choice=reader.readLine();

                if(choice.toLowerCase().equals("no")){
                    break;
                }

            }

            System.out.println("Your Data:");

            for(Student s:list){
                System.out.println("ID:"+s.id+" Name:"+s.name+" Age:"+s.age);
            }



        }catch(Exception e){
            System.out.println(e);
        }



    }
}
