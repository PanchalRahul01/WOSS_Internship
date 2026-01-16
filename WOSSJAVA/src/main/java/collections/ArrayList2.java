package collections;
import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();


        for(int i=1;i<=5;i++){
            list1.add(i*10);
        }
        System.out.println("List 1:"+list1);
        System.out.println("List 1 size:"+list1.size());

        for(int i=1;i<=5;i++){
            list2.add(i*20);
        }
        System.out.println("List 2:"+list2);
        System.out.println("List 2 size:"+list2.size());

        list1.addAll(list2);
        System.out.println("Merge two list:"+list1);
        System.out.println("Merge two listsize:"+list1.size());

    }
}
