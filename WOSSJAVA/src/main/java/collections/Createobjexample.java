package collections;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


class Employee {
    int id;
    String fname;
    String lname;

    Employee(int id, String fname, String lname){
        this.id=id;
        this.fname=fname;
        this.lname=lname;
    }
}



class Createobjexample{

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();



        Employee e1=new Employee(1,"Rahul","Panchal");
        Employee e2=new Employee(2,"Gaurav","Kiri");
        Employee e3=new Employee(3,"Nimesh","Prajapati");

        list.add(e1);
        list.add(e2);
        list.add(e3);

       // Iterator<Employee> iterator=list.iterator();
        ListIterator<Employee> itr=list.listIterator(list.size());

     /*   for(Employee e:list){
            System.out.println(e.id+e.fname+e.lname);
        }*/

        while(itr.hasPrevious()){
            Employee e=itr.previous();
            System.out.println(e.id+e.fname+e.lname);
        }



    }


}
