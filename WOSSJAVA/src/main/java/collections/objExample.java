package collections;

import java.util.ArrayList;
import java.util.List;

class EmployeeData{
    int id;
    String name;
    int Salary;

    EmployeeData(int id,String name,int Salary){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
}

public class objExample{

    public static void main(String[] args) {

        int[] id={1,2,3,4,5};
        String[] name={"A","B","C","D","E"};
        int[] salary={100,200,300,400,500};

        List<EmployeeData> list=new ArrayList<>();


        for (int i=0;i<id.length;i++){
            EmployeeData e=new EmployeeData(id[i],name[i],salary[i]);
            list.add(e);
        }

        for(EmployeeData e:list){
            System.out.println("ID:"+e.id+"Name:"+e.name+"Salary:"+e.Salary);
        }


    }
}
