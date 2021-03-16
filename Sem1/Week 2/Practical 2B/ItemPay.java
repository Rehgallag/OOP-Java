// Practical 2B- Question 3
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class ItemPay
{
   public static void main(String [] args)
   {
      // Create a Scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      // Declare variables
      double price, tendered, change;
      
      //1. Read in price
      System.out.print("Please enter the price of the item: ");
      price = keyboardIn.nextDouble();
      
      //2. Read in money tendered
      System.out.print("Please enter the amount tendered: ");
      tendered = keyboardIn.nextDouble();
      
      //3. Compute change due
      change = tendered - price;
      
      //4. Display change
      System.out.print("Change due: " + change);
      
       
  }
}