// Practical 3B- Question 4
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ExpensesTravelled
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      final double allowancePerMile = 10;
      final double overnightAllowance = 100;
      double milesTravelled, expenses;
      
      System.out.print("Enter the amount of miles travelled: ");
      milesTravelled = keyboardIn.nextDouble();
      
      expenses = milesTravelled * allowancePerMile;
      
      if(milesTravelled < 150)
      {
               System.out.print("Total Allowance = " + expenses);
      
      }
      else
      {
               System.out.print("Total Allowance = " + expenses + overnightAllowance);
               
      }
   }
}