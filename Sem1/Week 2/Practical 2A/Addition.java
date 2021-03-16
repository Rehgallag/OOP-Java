// Practical 2A- Question 1
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class Addition
{
   public static void main(String [] args)
      {
         // declare variables
         Scanner keyboardIn = new Scanner(System.in);
         double num1, num2, answer;
         
         // assign values to variables
         System.out.print("Please enter number 1: ");
         num1 = keyboardIn.nextDouble();
         
         System.out.print("Please enter number 2: ");
         num2 = keyboardIn.nextDouble();
         
         answer = num1 + num2;
         
         // display answer on screen
         System.out.print("The answer is " + answer);



      }
}