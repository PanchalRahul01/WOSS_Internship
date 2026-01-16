package PracticeProg;

public class prac13 {


    public static void main(String[] args) {


        System.out.println("Pettern 1....");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Pettern 2....");


        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pettern 3....");

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=(4-i)*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println(" ");
        }

        System.out.println("Pettern 4...."      );
        for (int i = 1; i <= 5; i++) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (int j = i; j <= 5; j++) {
                System.out.print(j+" ");
            }

            // printing new line for each row
            System.out.println();
        }


        System.out.println("Pettern 5...."      );

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
