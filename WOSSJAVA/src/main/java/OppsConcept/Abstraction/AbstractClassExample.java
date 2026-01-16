package OppsConcept.Abstraction;


abstract class A {
    abstract void say();


    void simpleSay(){
        System.out.println("hello");
    }
}


class B extends A{

    @Override
    void say(){
        System.out.println("hello abstract method");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {
         B b=new B();
         b.simpleSay();
         b.say();
    }

}
