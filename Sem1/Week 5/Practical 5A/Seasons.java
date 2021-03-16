// Practical 5A- Question 4
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Seasons
{
   public static void main(String  [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int month;
      
      System.out.print("Enter a month number [1-12]:  ");
      month = in.nextInt();
      
      switch(month)
      {
         case 1:
         case 2:
         case 12: System.out.print("It is winter.");
            break;
         case 3:
         case 4:
         case 5: System.out.print("It is spring.");
            break;
         case 6:
         case 7:
         case 8: System.out.print("It is summer.");
            break;
         case 9:
         case 10:
         case 11: System.out.print("It is autumn.");
          break;


      }
   }
}