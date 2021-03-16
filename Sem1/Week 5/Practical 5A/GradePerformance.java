// Practical 5A- Question 1
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class GradePerformance
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      char grade;
      
      System.out.print("Please enter a grade: ");
      grade = in.next().charAt(0);
      
      switch(grade)
      {
         case 'A': // sharing cases
         case 'a': System.out.print("Excellent student");
                  break; 
         case 'B':
         case 'b': System.out.print("Good student");
                  break;
         case 'C':
         case 'c':
         case 'D':
         case 'd': System.out.print("Fair student");
                  break;
         case 'E':
         case 'e':
         case 'F':
         case 'f': System.out.print("Poor student");
                  break;
         default: System.out.print("Invalid grade");         
         //end switch


      }
   }
}