/*Write a program to merge two files into the third file.*/

package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class prac3 {
    public static void main(String[] args) {

        try{
            //two input file
            FileInputStream file1 = new FileInputStream("D:/prac3/abc.txt");
            FileInputStream file2 = new FileInputStream("D:/prac3/pqr.txt");
            //one outputfile
            FileOutputStream file3 = new FileOutputStream("D:/prac3/mno.txt");

            int ch;

            //read all data to the file when data is empty then close..
            while ((ch = file1.read()) != -1) {
                file3.write(ch);
            }

            while( (ch = file2.read()) != -1) {
                file3.write(ch);
            }

            //close the file ..
            file1.close();
            file2.close();
            file3.close();

            System.out.println("Merge Successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
