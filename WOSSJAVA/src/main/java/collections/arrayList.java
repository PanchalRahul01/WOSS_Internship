package collections;

import org.w3c.dom.ls.LSOutput;
import java.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList all=new ArrayList<>();

        all.add(1);
        all.add("abcd");
        all.add("nimesh");
        list.add(1);
        list.add(2);
        list.add(3);

        list.set(0,4);

        //by index
        list.remove(0);
        //by value

        all.remove("abcd");

        System.out.println(list);
        System.out.println(all);

        System.out.println("Print all data of all ArrayList");

        for(int i=0;i<all.size();i++){
            System.out.println(all.get(i));
        }

        System.out.println("Print all data of list ArrayList");

        for(int data:list){
            System.out.println(data);
        }

        Collections.sort(list);
        Collections.sort(all);

        System.out.println(list);

        //GIVE ERROR NOT PRINT CLASS CAST   EXCEPTION
        System.out.println(all);



    }
}
