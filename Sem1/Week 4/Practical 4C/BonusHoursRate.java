// Practical 4C- Question 1
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class BonusHoursRate
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      double hours = 0, rate, wages;
      
      System.out.print("Please enter the amount of hours: ");
      hours = in.nextDouble();
      
      System.out.print("Please enter the rate: ");
      rate = in.nextDouble();
      
      wages = hours * rate;
      
      if(hours < 0 || rate < 0)
      {
               System.out.print("ERROR: INVALID");
      }
      else
      {
               System.out.print(wages);
      }
      if(hours > 45)
      {
               System.out.print(wages + (wages * .2));
      }
      else if (hours > 40)
      {
               System.out.print( wages + (wages * 1.5));
      }
      else if (hours > 37)
      {
               System.out.print(wages + (wages * .1));
      }

   }
}