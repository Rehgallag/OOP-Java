// Practical 2B- Question 4
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class Discount
{
   public static void main(String [ ] args)
   {
      // Create a Scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      // Declare variables
      double prod1, prod2, prod3, gross, total;
      double discount, disc1;
      
      //1. Read and Store porduct price
      System.out.print("Please enter the price of product 1: ");
      prod1 = keyboardIn.nextDouble();
      
      System.out.print("Please enter the price of product 2: ");
      prod2 = keyboardIn.nextDouble();
      
      System.out.print("Please enter the price of product 3: ");
      prod3 = keyboardIn.nextDouble();
      
      discount = 0.1;
      disc1 = (prod1 + prod2 + prod3) * discount;
      gross = prod1 + prod2 + prod3;
      //2. Compute change
      total = (prod1 + prod2 + prod3) - disc1;
      
      //3. Display on screen
      System.out.print("Gross amount: " + gross);
      System.out.println("\nDiscount earned: " + disc1);
      System.out.println("Total amount due: " + total);      

   }
}