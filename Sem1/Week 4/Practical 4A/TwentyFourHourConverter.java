// Practical 4A- Question 4
// John Gallagher
// 8 October 2019
// Program to display result on screen

import java.util.Scanner;

public class TwentyFourHourConverter
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      
      int  hrs = 0, hours = 0;
      int  mins = 0;
      
      System.out.print("Enter the hours: ");
      hrs = keyboardIn.nextInt();
      
      System.out.print("Enter the minutes: ");
      mins = keyboardIn.nextInt();
      
            if ( hrs >= 12 && hrs <= 24 )
            {
                     hours = hrs - 12;
                     System.out.print( hours + ":" + mins + "p.m.");
            }
            else if ( hrs >=0 && hrs <= 11)
            {
                     System.out.print( hrs + ":" + mins + "a.m.");
            }
            else
            {
                     System.out.print("Error");
            }
   }
}