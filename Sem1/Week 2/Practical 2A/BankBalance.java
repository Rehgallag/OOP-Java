// Practical 2A- Question 5
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class BankBalance
{
   public static void main(String [] args)
   {
      //declare variables
      Scanner keyboardIn = new Scanner(System.in);
      double currentbal, deposit, newbal;
      
      //assign values to variables
      System.out.print("Please enter your current bank balance: ");
      currentbal = keyboardIn.nextDouble();
      
      System.out.print("Please enter the amount you wish to deposit: ");
      deposit = keyboardIn.nextDouble();
      
      newbal = currentbal + deposit;
      
      //display values on screen
      System.out.print("Your new balance is E" + newbal);




   }
}