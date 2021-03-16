// Practical 3B- Question 2
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class GamesPrice
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare vairable
      double price1, price2, total1, disc1, disc2;
      
      //Prompt user input //assign variable
      System.out.print("Please enter the price of the first game: ");
      price1 = keyboardIn.nextDouble();
      
      System.out.print("Please enter the price of the seconde game: ");
      price2 = keyboardIn.nextDouble();
      
      total1 = price1 + price2;
      disc1 = total1 * .2;
      disc2 = total1 * .1;
      //determine if total will get discounted by 20 or 10 
      if(total1 > 50.00)
      {
               System.out.print("Your total is " + total1);
               System.out.println("\nDiscount being applied");
               System.out.println("Your new total is " +(total1 - disc1));
      }   
      else
      {
               System.out.print("Your total is " + total1);
               System.out.println("\nDiscount being applied");
               System.out.print("Your new total is " +(total1 - disc2));
      }          
   }
}