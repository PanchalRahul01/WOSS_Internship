/*32. Write a program to calculate invoice amount. The program will ask the following
questions :
Start Date
End Date
Per Day Charge ($)
Exclude Saturday?
Exclude Sunday?
Calculate the number of days between end date & start date, exclude Saturdays &
Sundays based on the answer and multiply it with per day charges. Show the answer as
an invoice amount in format $###,###,###.*/


package PracticeProg;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class prac32 {

    public static int[] calDays(LocalDate StartDate, LocalDate EndDate) {

        int totaldays=0;
        int totalSun=0;
        int totalSat=0;

        while(!StartDate.isAfter(EndDate)){

            DayOfWeek dow=StartDate.getDayOfWeek();
            totaldays++;

            if(dow == DayOfWeek.SATURDAY){
                totalSat++;
            }
            if(dow == DayOfWeek.SUNDAY){
                totalSun++;
            }

            StartDate = StartDate.plusDays(1);
        }
        return new  int[]{totaldays,totalSat,totalSun};

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Start Date : ");
        LocalDate StartDate=LocalDate.parse(sc.next());
        System.out.println();
        System.out.print("Enter the End Date : ");
        LocalDate EndDate=LocalDate.parse(sc.next());
        System.out.println();

        System.out.println("Exclude Saturday?(yes/no)");
        String sat=sc.nextLine();
        System.out.println("Exclude Sunday?(yes/no)");
        String sund=sc.nextLine();

        System.out.print("Enter per Day Charges:");
        int charges=sc.nextInt();
        calDays(StartDate,EndDate);

        int sunDay=calDays(StartDate,EndDate)[2];
        int satDay=calDays(StartDate,EndDate)[1];
        int totaldays=calDays(StartDate,EndDate)[0];
        int amount=1;
        int Days=0;

        DecimalFormat  df = new DecimalFormat("$###,###,###.00");

        if(sat.toLowerCase().equals("no")){
            Days=totaldays+satDay-sunDay;
        }
        else if(sund.toLowerCase().equals("no")){
            Days=totaldays+sunDay-satDay;
        } else if (sat.toLowerCase().equals("no") && sund.toLowerCase().equals("no")) {
            Days=totaldays+satDay+sunDay;
        }
        else{
            Days=totaldays-(satDay+sunDay);
        }

        amount=charges*Days;

        System.out.println("Total Charges: "+df.format("$###.###.###.00"));

        // NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);











    }
}
