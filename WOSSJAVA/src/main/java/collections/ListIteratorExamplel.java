package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExamplel{

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            list1.add(i);
            list2.add(i);
        }

        System.out.println("List "+list1);

        ListIterator<Integer> itr1=list1.listIterator();
        ListIterator<Integer> itr2=list2.listIterator(list2.size());
        ListIterator<Integer> itr3=list2.listIterator(5);

        System.out.print("ListIterator Forward:");

        while(itr1.hasNext()){
            System.out.print(itr1.next());
        }
        System.out.println();

        System.out.print("ListIterator Backward:");

        while(itr2.hasPrevious()){
            System.out.print(itr2.previous());
        }

        System.out.println();

        System.out.print("Iterator value specific index 5 :");

        while(itr3.hasNext()){
            System.out.print(itr3.next());
        }



    }
}
