/*Write a program for shopping carts. Ask users to enter item name, quantity and amount
per item and calculate final and show the bill in a pretty format.
Operations
1. Add Item
2. Remove Item
3. View Cart
4. Exit
Add Item
Item Name
Quantity
Price per Unit
Remove Item
Item Name
View Cart */


package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Shopping_Cart{
            private String name;
            private int quantity;
            private double price;
            private double total;

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
            public double gettotal(){
                return this.total;
            }

            public void settotal(double total){
                this.total=total;
            }

            public Shopping_Cart(String name,int quantity,double price,double total){
                this.name=name;
                this.quantity=quantity;
                this.price=price;
                this.total=total;
            }


        }

public class prac3{

    ArrayList<Shopping_Cart> cart=new ArrayList<>();


    public void Add_Item(String name, int quantity, double price,double total) {
        Shopping_Cart c=new Shopping_Cart(name,quantity,price,total);
        cart.add(c);
    }
    public void Remove_Item(String name) {

        Iterator<Shopping_Cart> it = cart.iterator();
        while(it.hasNext()){
            Shopping_Cart c = it.next();
            if(c.getName().equalsIgnoreCase(name)){
                it.remove();
            }
        }

        //cart.removeIf(c -> c.getName().equals(name));
    }
    public void View_cart(){

        for(Shopping_Cart c : cart){

            if(cart.isEmpty()){
                System.out.println("Nothing to show..");
            }

            System.out.println(c.getName()+"----->"+c.getQuantity()+"------->"+c.getPrice()+"------->"+c.gettotal());
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        prac3 pr=new prac3();
        String name;
        int quantity;
        double price;
        double total;

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
                     total=quantity*price;
                     pr.Add_Item(name,quantity,price,total);
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
