// Demo program
// John Gallagher
// 23 September 2019

import java.util.Scanner;

public class DemoProgram
{
  public static void main(String[ ] args)
  {
   //declare variable 
  Scanner keyboardIn = new Scanner(System.in);
   int number1;
   int number2;
   int result;
   
   //assign value 
   System.out.print("Please enter number 1: ");
   number1 = keyboardIn.nextInt();
   
   System.out.print("Please enter number 2: ");
    number2 = keyboardIn.nextInt();
   
   
   result = number1 + number2;

   //display area on screen
   System.out.print("The answer is " + result);
   
   
   
  }
}