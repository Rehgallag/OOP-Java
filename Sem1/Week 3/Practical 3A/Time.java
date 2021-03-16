// Practical 3A- Extra Practice Question
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Time
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      int sec = 0; min = 0; hrs = 0;
      double min1;
      //prompt user input //assign variables
      System.out.print("Please enter the number: ");
      sec = keyboardIn.nextInt();
      
      if(sec >= 60)
      {
               //display message
               min = sec / 60;
               sec = sec % 60;
       }

      if(min >= 60)
      {
               hrs = min / 60;
               min1 = min % 60;
      }
      
      

   }
}