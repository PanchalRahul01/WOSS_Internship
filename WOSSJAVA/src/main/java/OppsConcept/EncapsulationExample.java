package OppsConcept;




class accessModify extends abc {
            protected int a;
        }

class person{
    private int id;
    private String  name;

    public int age;

    public void id(int id){
        this.id=id;
    }

    public void name(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}


public class EncapsulationExample extends person{

    public static void main(String[] args) {
        person p=new person();

        p.age=10;

        p.name("Jay");
        p.id(10);

        System.out.println(p.getId());
        System.out.println(p.getName());
    }


}