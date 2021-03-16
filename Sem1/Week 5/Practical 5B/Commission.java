// Practical 5B- Question 2
// John Gallagher
// 17 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Commission 
{
   public static void main(String [ ] args) 
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int prodCode, sold;
      double commission;
      
      System.out.print("Enter the product code: ");
      prodCode = in.nextInt();
      
      System.out.print("Enter the amount sold: ");
      sold = in.nextInt();

      switch(sold)
      {
         case "code 1":
         case "amount sold":
         case "com 5%": System.out.print("The commission earned is " + sold * .05);
               break;
         case "code 2":
         case "amount sold":
         case "com 20%": System.out.print("The commission earned is " + sold * .2);
               break;
         case "code 3":
         case "amount sold":
         case "com 10%": System.out.print("The commission earned is " + sold * .1);
               break;
         case "code 4":
         case "amount sold":
         case "com 5%": System.out.print("The commission earned is " + sold * .05);
               break;



      }
   }
}