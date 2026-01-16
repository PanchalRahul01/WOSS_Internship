package PracticeProg;

public class prac18 {


    public static void jay(int num,int num1,int count){
        int sum=0;
         sum+=num1;

                if(count==3){
                    return;
                }

                jay(num,num1*10+num,count+1);
        System.out.println(sum);


    }


    public static void main(String[] args) {

        int num=5;
        int sum=0;
        int count=1;
        int multi=5;
        for(int i=1;i<=3;i++){

            sum=sum+multi;
            multi=multi*10+num;
        }
        System.out.println(sum);
        jay(num,num,count);
    }
}
