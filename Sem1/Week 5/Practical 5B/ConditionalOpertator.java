// Practical 5B- Question 1
// John Gallagher
// 17 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ConditionalOpertator
{
   public static void main(String [ ] args)
   {
      //declare vairable
      Scanner in = new Scanner(System.in);
      double number;
      
      System.out.print("Enter the number: ");
      number = in.nextDouble();
      
      if(number < 0 )
      {
               System.out.print("The number is negative.");
      }
      else if(number >= 0)
      {
               System.out.print("The number is positive.");
      }
      



   }
}