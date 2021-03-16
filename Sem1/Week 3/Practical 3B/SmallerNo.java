// Practical 3B- Question 1
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class SmallerNo
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //read in variables
      double num1, num2;
      
      //prompt input from user
      System.out.print("Enter the first number: ");
      num1 = keyboardIn.nextDouble();
      
      System.out.print("Enter the second number: ");
      num2 = keyboardIn.nextDouble();
      
      //determine if a number is smaller 
      if(num1 > num2)
      {
            System.out.println(num2 + " is the smaller number");
      }
      else
      {
            System.out.println(num1 + " is the smaller number");
      }
   }
}
