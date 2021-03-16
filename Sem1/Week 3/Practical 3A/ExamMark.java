// Practical 3A- Question 2
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ExamMark
{
   public static void main(String[ ] args)
   {
      // create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      // declare variable
      double examMark = 0;
      
      // assign value to variable
      System.out.print("Please enter your exam mark: ");
      examMark = keyboardIn.nextDouble();
      
      if(examMark >= 40)
      {
               System.out.print("You have passed this exam");
      }
      
      if(examMark < 40)
      {
               System.out.print("You have failed this exam");
      }
   }
}