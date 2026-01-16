package PracticeProg;

public class prac14 {


    public  static void calYear(int days){

        int year=days/365;
        int remaindays=days%365;

        if(remaindays>=7){
            int week=remaindays/7;
            int otherdays=remaindays%7;
            System.out.println("Year:"+year+"week:"+week+"days:"+otherdays);
        }
        else{
            System.out.println("Year:"+year+"days:"+remaindays);
        }

    }



    public static void main(String[] args) {
        calYear(385);
    }
}
