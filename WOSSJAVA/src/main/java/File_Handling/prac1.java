/*Write a program to find the size of a all the files in a folder
Expected Output:
/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes*/

package File_Handling;

import java.io.File;

public class prac1 {

    public static void main(String[] args) {
        String File_Path = "D:/prac3/";
        File obj=new File(File_Path);


        //Diractory Name Wrong or Not Exists..
        if(!obj.exists() || !obj.isDirectory()){
            System.out.println("File does not exist or is not a directory");
            return;
        }

        File[] files = obj.listFiles();

        if(files!=null){
            for(File file:files){
                if(file.isFile()){
                    System.out.println(file.getAbsoluteFile()+"length"+file.length());
                }
            }
        }




    }

}
