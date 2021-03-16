// Practical 4B- Question 2
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class AccountBalance
{
   public static void main(String [ ]  args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      
      double accountBalance = 0;
      
      System.out.print("Please enter your balance: ");
      accountBalance = in.nextDouble();
      
         if ( accountBalance < 0 )
         {
                  System.out.print("Your account is over drawn by " + accountBalance + " euro");
         }
         else
         {
                  System.out.print("Your account is in credit by " + accountBalance + " euro");
         }



   }
}