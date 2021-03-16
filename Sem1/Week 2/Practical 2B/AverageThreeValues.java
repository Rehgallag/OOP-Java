// Practical 2B- Question 1
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class AverageThreeValues
{
   public static void main(String [ ] args)
   {
      // create a Scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      // declare variables
      double num1, num2, num3, result;
      
      // assign values to variables
      System.out.print("Please enter your first value: ");
      num1 = keyboardIn.nextDouble();
      
      System.out.print("Please enter your second value: ");
      num2 = keyboardIn.nextDouble();
      
      System.out.print("Please enter your third value: ");
      num3 = keyboardIn.nextDouble();
      
      // Compute average
      result = (num1 + num2 + num3) /3;
      
      // Display average
      System.out.print("The average is " + result); 


   }
}