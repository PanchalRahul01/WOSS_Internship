package collections;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Shopping_Cart{
            private String name;
            private int quantity;
            private double price;

            public String getName(){
                return this.name;
            }
            public void setName(String name){
                this.name=name;
            }
            public int getQuantity(){
                return this.quantity;
            }
            public void setQuantity(int quantity){
                this.quantity=quantity;
            }
            public double getPrice(){
                return this.price;
            }
            public void setPrice(double price){
                this.price=price;
            }

            public Shopping_Cart(String name,int quantity,double price){
                this.name=name;
                this.quantity=quantity;
                this.price=price;
            }

        }

public class prac3{

    ArrayList<Shopping_Cart> cart=new ArrayList<>();


    public void Add_Item(String name, int quantity, double price) {
        name=name;
        quantity=quantity;
        price=price;
        Shopping_Cart c=new Shopping_Cart(name,quantity,price);
        cart.add(c);
    }

    public void Remove_Item(String name) {
        cart.removeIf(c -> c.getName().equals(name));
    }
    public void View_cart(){

        for(Shopping_Cart c : cart){
            System.out.println(c.getName()+c.getQuantity()+c.getPrice());
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        prac3 pr=new prac3();
        String name;
        int quantity;
        double price;

        while(true){

            System.out.println("Operations....");
            System.out.println("1.Add Item \n" +
                    "2. Remove Item \n" +
                    "3. View Cart \n" +
                    "4. Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Item Name :");
                     name = sc.next();
                    System.out.println("Enter the Quantity :");
                     quantity = sc.nextInt();
                    System.out.println("Enter Item Price pr Unit :");
                     price = sc.nextInt();
                     pr.Add_Item(name,quantity,price);
                     break;
                case 2:
                    System.out.println("Enter the Item Name :");
                    name = sc.next();
                    pr.Remove_Item(name);
                    break;
                case 3:
                    System.out.println("Item Name  Quantity   amount   Total price");
                    pr.View_cart();
                    break;
                case 4:
                    return;

            }
        }

    }

}
