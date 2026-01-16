package OppsConcept.inheritance;

class a{

    private int id=10;

    public String name="Rahul";

    void say(){
        System.out.println("<UNK>");
    }


}

class b extends a{

    @Override
    void say() {
        System.out.println("Hello World");
    }
}

public class SingleLevelExample {

    public static void main(String[] args) {


        a a=new a();
        a.say();
        b b=new b();
        b.say();
        a a1=new b();
        a1.say();


    }
}
