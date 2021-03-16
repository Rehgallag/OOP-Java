// Practical 6A- Question 3
// John Gallagher
// 22 October 2019
// Program to display result on screen

import java.util.Scanner;

public class DutyFree
{
   public static void main(String [ ] args)
   {
      // declare variable
      Scanner in = new Scanner(System.in);
      double totalPurch;
      double  dutyfree;      
      char eu;
      
      System.out.print("Enter the total price of purchases: ");
      totalPurch = in.nextDouble();
      System.out.print("Enter yes(Y) or no(N) if destination is in the EU: ");
      eu = in.next().charAt(0);
      dutyfree = totalPurch - totalPurch*21/100;

      switch(eu)
      {
         case 'Y': // sharing cases
         case 'y': System.out.print("The total price calculated is: " + totalPurch);
                  break; 
         case 'N':
         case 'n': System.out.print("The total price calculated is: " + dutyfree);
                  break;
         default : System.out.print("Invalid input");
      }
      
      
      


   }
}