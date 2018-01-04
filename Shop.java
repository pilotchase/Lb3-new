
// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{

    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;

        String itemName;

        double itemPrice;

        int quantity;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();

                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();


                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();


                // *** create a new item and add it to the cart
                Item thing = new Item(itemName, itemPrice, quantity);
                cart.add(thing);
                



                // *** print the contents of the cart object using println
                System.out.println(cart);


                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);

    }


   public static void checkOut(ArrayList<Item> yourCart) {

        //You do NOT need a getter method (think about public instance variables)


        System.out.println(yourCart);


        System.out.print ("Would you like to remove an item? (y/n)");

        Scanner checkout = new Scanner(System.in);
        String remove = checkout.next();
        
        if(remove == "y")
        {
            System.out.print ("Which item would you like to remove?");
            int itemRemove = checkout.nextInt();
            yourCart.remove(itemRemove);
        }

        double Total;
        //Print final total of items and final price (total)
        for(int i = 0; i <= yourCart.size(); i++)
        {
            Total += yourCart[i].getPrice();
        }
        
        System.out.println(Total);

        


}

}