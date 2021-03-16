// Practical 4A- Question 2
// John Gallagher
// 8 October 2019
// Program to display result on screen

import java.util.Scanner;

public class CinemaTicketPricing
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      
      //prompt user input
      System.out.print("Please enter your age: ");
      age = keyboardIn.nextInt();
      
         if ( age <= 12 )
         {
                  System.out.print("Your ticket price is free.");
         }
         else if ( age < 12 && age <= 18 )
         {
                  System.out.print("Your ticket price is E5.00.");
         }
         else if (age >= 65 )
         {
                  System.out.print("Your ticket price is E4.50.");
         }
         else 
         {
                  System.out.print("Your ticket price is E6.00.");
         }
   }
}