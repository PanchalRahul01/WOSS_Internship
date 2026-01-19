/*Write a program to
        i.
        count the number of characters in the file.
        ii.
        iii.
        count the number of words in the file
        count the number of lines in the file.*/


package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;

public class prac2 {

    public static void main(String[] args) {

        String FilePath="D:/prac3/";

        File obj=new File(FilePath);

        if(!obj.exists() || !obj.isDirectory()){
            System.out.println("File does not exist or is not a directory");
        }

        File[] files = obj.listFiles();

        try{
            FileReader fr=new FileReader(FilePath);



        }
        catch(Exception e){
            System.out.println("File does not exist or is not a directory");
        }


        if(files!=null){
            for (File file : files) {
                System.out.println("File"+file.getAbsoluteFile());
            }
        }
    }

}
