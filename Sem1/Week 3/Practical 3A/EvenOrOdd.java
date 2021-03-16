// Practical 3A- Question 6
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class EvenOrOdd
{
   public static void main(String [ ] args)
   {
      //create a scanner objecy
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      int number;
      
      //prompt user to input  //assign value to variable
      System.out.print("Please enter the number: ");
      number = keyboardIn.nextInt();
      
      if(number%2 == 0)
      {
               System.out.println("Your number is even");
      }

      if(number%2 != 0)
      {
               System.out.println("Your number is odd");
      }

   }
}
