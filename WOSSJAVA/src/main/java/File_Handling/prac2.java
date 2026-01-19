/*Write a program to
        i.
        count the number of characters in the file.
        ii.
        iii.
        count the number of words in the file
        count the number of lines in the file.*/


package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;

public class prac2 {

    public static void main(String[] args) {

        File obj=new File("pqr.txt");

        if(obj.delete()){
            System.out.println("File Deleted");
        }
        else {
            System.out.println("File Not Deleted");
        }



/*
        try{
            if (files == null) throw new AssertionError();
            FileReader fr=new FileReader(files[1]);
            BufferedReader br=new BufferedReader(fr);





        }
        catch(Exception e){
            System.out.println("File does not exist or is not a directory");
        }*/

    }

}
