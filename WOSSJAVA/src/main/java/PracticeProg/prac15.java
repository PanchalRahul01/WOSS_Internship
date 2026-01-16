package PracticeProg;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;

public class prac15 {

    public static void main(String[] args) {

        LocalDate d=LocalDate.now();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(d);
    }
}
