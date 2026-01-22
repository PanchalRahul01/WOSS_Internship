package MeetingTopics;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class panchal{
    int id;
    String name;

    panchal(int id){
        this.id=id;
        this.name=name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj==null) return false;

        panchal panchal = (panchal)obj;
        return id == panchal.id
        && name==panchal.name;
    }



}

public class topic1{

    public static void main(String[] args) {
        panchal p=new panchal(1);
        panchal p1=new panchal(1);

        HashSet<panchal>  h=new HashSet<panchal>();
        h.add(p);
        h.add(p1);

        System.out.println(h.size());

    }
}
