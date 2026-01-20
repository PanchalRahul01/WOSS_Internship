/*Create a callable service called FactorialCalculatorService. Value should be between 0
to 15.*/

package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FactorialCalculatorService implements Callable<Long> {

    int range;

    FactorialCalculatorService(int range) {
        this.range = range;
    }

    public Long  call() throws Exception{

        if(range<1||range>15){
            throw new Exception("End range is greater than 15");
        }
        long factorial = 1;
        for(int i=range; i<=range; i++){
            factorial = i*factorial;
        }
        return factorial;
    }
}

public class prac3 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialCalculatorService fs=new FactorialCalculatorService(6);

        try{
           Future<Long> result= executorService.submit(fs);
            System.out.println(result.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        executorService.shutdown();
    }

}
