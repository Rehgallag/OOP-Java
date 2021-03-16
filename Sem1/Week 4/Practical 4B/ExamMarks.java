// Practical 4B- Question 1
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ExamMarks
{
   public static void main(String [ ] args)
   {
      // declare variable
      Scanner in = new Scanner(System.in);
      int mark = 0;
      
      System.out.print("Please enter your exam mark: ");
      mark= in.nextInt();
      
         if ( mark < 0 || mark > 100)
         {
                  System.out.print("ERROR: Invalid mark");
         }
         else if ( mark >= 40)
         {
                  System.out.print("You have passed");
         }
         else 
         {
                  System.out.print("You have failed");
         }

   }
}