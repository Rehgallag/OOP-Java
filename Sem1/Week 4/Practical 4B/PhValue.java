// Practical 4B- Question 3
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class PhValue
{
   public static void  main(String [ ] args)
   {
      // declare variable
      Scanner in = new Scanner(System.in);
      int phValue;
      
      System.out.print("Please enter a pH value: ");
      phValue = in.nextInt();
      
         if (phValue >=0 && phValue < 7)
         {
                  System.out.print("That pH value is Acidic");
         }
         else if ( phValue > 7 && phValue <= 14 )
         {
                  System.out.print("That pH value is Alkaline");
         }
         else if ( phValue == 7)
         {
                  System.out.print("That pH value is Neutral");
         }
         else if (phValue < 0 || phValue > 14)
         {
                  System.out.print("Invalid entry");
         }

   }
}