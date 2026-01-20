package File_Handling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class prac4 {

    static class Data{
        int days=0;
        double expense=0;
        double income=0;
    }

    public static void main(String[] args) throws Exception {

        Map<YearMonth,Data> map = new LinkedHashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("D:/prac3/finance.csv"));
        br.readLine();

        String Line;

        while ((Line = br.readLine()) != null) {

            String[] csv = Line.split(",");


        }




    }
}
