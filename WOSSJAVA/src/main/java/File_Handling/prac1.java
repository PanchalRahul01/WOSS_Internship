/*Write a program to find the size of a all the files in a folder
Expected Output:
/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes*/

package File_Handling;

import java.io.File;

public class prac1 {

    public static void main(String[] args) {
        String File_Path = "D:/Prac3/";
        File obj=new File(File_Path);

        if(!obj.exists() && !obj.isDirectory()){
            System.out.println("File does not exist or is not a directory");
        }



    }

}
