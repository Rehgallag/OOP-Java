// Practical 4B- Question 4
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class MaritalStatus
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      
      double income;
      char status;
      
      System.out.print("Please enter your income: ");
      income = in.nextDouble();
      
      System.out.print("Please enter M or S to indicate you marital stauts: ");
      status = in.next().charAt(0);
      
         if( income < 20000 && status == 'S')
         {
                  System.out.print("You are in tax band A");
         }
         else if( income < 20000 && status == 'M')
         {
                  System.out.print("You are in tax band B");
         }
         else if( income > 20000 && status == 'S')
         {
                  System.out.print("You are in tax band C");
         }
         else if( income > 20000 && status == 'M')
         {
                  System.out.print("You are in tax band D");
         }
         else
         {
                  System.out.print("Invalid");
         }

   }
}