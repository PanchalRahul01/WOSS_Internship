package OppsConcept;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.concurrent.ExecutionException;

class abc{
    protected  int b;
}

class RahulException extends ArithmeticException{
            public RahulException(String message){
                super(message);
            }


        }

public class problem {
    public static void main(String[] args) {


        int i=20;
        int j=0;



        try{

            j=0;
            if(j==0){
                throw  new  RahulException("This is Rahul Exception:");
            }

        }catch (Exception e1){
            j=18/1;
            System.out.println("RahulException"+e1.getMessage());
        }
    }
}
