package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> itr=list.iterator();


        while(itr.hasNext()){
            System.out.print(itr.next()+"->");
        }

    }
}
