// Practical 2A- Question 4
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class HourConverter
{
   public static void main(String [] args)
   {
      //declare variables
      Scanner keyboardIn = new Scanner(System.in);
      int hours, result;
      
      //assign values to variables
      System.out.print("Enter number of hours: ");
      hours = keyboardIn.nextInt();
      
      result = hours * 60;
      
      //display results on screen
      System.out.print("Number of minutes: " + result);



   }
}