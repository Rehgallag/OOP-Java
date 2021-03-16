// Practical 3A- Question 5
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Computer
{
   public static void main(String [ ] args)
   {
      //create a scanner
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      int price, quantity, total, newPrice;
      
      //prompt user tp input
      System.out.print("How many computers would you like: ");
      quantity = keyboardIn.nextInt();
     
      //assign values to variable
      price  = 550;
      newPrice = 500;
      total = quantity * price;
      
      if(quantity >= 30)
      {
               //display message
               System.out.println("Your total cost is " + newPrice * quantity);  
      }   

      if(quantity < 30)
      {
               //display message
               System.out.println("Your total cost is " + total);
      }
   }
}