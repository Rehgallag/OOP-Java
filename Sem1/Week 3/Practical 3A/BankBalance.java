// Practical 3A- Question 1
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class BankBalance
{
   public static void main(String [ ] args)
   {
      // create a Scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      double bankBalance = 0;
      
      // assign value to variable
      System.out.print("Please enter your bank balance: ");
      bankBalance = keyboardIn.nextDouble();
      
      if(bankBalance > 0)
      {
               System.out.println("You are in credit");
      }
   }
}