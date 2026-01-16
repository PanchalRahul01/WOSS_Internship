package kunalKushwaha;

import java.util.HashSet;

public class abc {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println(set.toString());

        for(Integer i:set){
            System.out.println(i);
        }
    }
}
