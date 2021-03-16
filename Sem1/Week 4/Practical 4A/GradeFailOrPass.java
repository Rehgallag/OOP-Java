// Practical 4A- Question 1
// John Gallagher
// 8 October 2019
// Program to display result on screen

import java.util.Scanner;

public class GradeFailOrPass
{
   public static void main(String [] args)
   {
   //declare variable
   Scanner keyboardIn = new Scanner(System.in);
   
   int mark;
   
   System.out.print("Please enter your grade: ");
   mark = keyboardIn.nextInt();
   
   if ( mark <= 39 )
   {
            System.out.print("Fail.");
   }
   else if ( mark >= 40 && mark <= 54 )
   {
            System.out.print("Pass.");
   }
   else if ( mark >= 55 && mark <= 69)
   {
            System.out.print("Merit.");
   }  
   else if ( mark >= 70 && mark <= 100)
   {
            System.out.print("Distinction.");
   }
   }
     
}