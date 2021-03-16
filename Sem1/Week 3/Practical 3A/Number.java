// Practical 3A- Question 3
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Number
{
   public static void main(String [ ] args)
   {
         //create a scanner object
         Scanner keyboardIn = new Scanner(System.in);
         
         //declare a variable
         int number = 0;
         
         //prompt user to input
         System.out.print("Please enter a number: ");
         
         //read and store keyboard input
         number = keyboardIn.nextInt();
         
         if(number > 100)
         {
                  //display message
                  System.out.println("Your number is over 100");
         } 
         
         if(number  < 100)
         {
                  //display message
                  System.out.println("Your number is less than 100");
         }
   }
}