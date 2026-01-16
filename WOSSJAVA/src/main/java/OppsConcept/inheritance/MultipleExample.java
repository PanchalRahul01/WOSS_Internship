package OppsConcept.inheritance;

interface A1 {

     public void say();
     default void car(){
         System.out.println("A1 car");
     }

}
interface B1{
    default void car(){
        System.out.println("B1 car");
    }
}

class c1 implements A1,B1{

    public void say(){
        System.out.println("A1 say");

    }
    public void car(){
        A1.super.car();
        B1.super.car();
    }
}



public class MultipleExample{

    public static void main(String[] args) {

        c1 c=new c1();
        c.say();
        c.car();
    }

}
