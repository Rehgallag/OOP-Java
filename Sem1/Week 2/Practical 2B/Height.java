// Practical 2B- Question 5
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class Height
{
   public static void main(String [ ] args)
   {
      // create scanner object
      Scanner keyboardIn =  new Scanner(System.in);
      
      //declare variables
      double heightInches, heightFeet, inches;
      
      //assign values
      System.out.print("Please enter your height in inches: ");
      heightInches = keyboardIn.nextDouble();
      
      //compute height in feet
      heightFeet = heightInches / 12;
      inches = heightInches % 12;
      
      //display height on screen
      System.out.print("Your height in Feet and inches is " + heightFeet + "Foot\t" + inches +"inches");



   }
}