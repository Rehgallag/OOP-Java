// Practical 2A- Question 2
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class AgeCalculator
{
   public static void main(String [] args)
   {
      //declare variables
      Scanner kbIn = new Scanner(System.in);
      int age, result;
      
      //assign values to variables
      System.out.print("Enter your age: ");
      age = kbIn.nextInt();
      
      result = age * 365;
      
      // display results on screen
      System.out.print("Your age in days is " + result);



   }
}