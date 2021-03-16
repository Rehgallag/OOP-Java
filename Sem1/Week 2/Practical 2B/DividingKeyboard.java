// Practical 2B- Question 6
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class DividingKeyboard
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variables
      int num1, num2, result, remainder;
      
      //assign values to variables
      System.out.print("Enter the first number: ");
      num1 = keyboardIn.nextInt();
      
      System.out.print("Enter your second number: ");
      num2 = keyboardIn.nextInt();
      
      //compute division
      result = num1 / num2;
      remainder = num1 % num2;
      
      //display result
      System.out.print(num1 + " divided by " + num2 + " equals " + result + " remainder " + remainder);
      

   }
}