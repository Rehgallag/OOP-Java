// Practical 3B- Question 3
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class CreditLimit
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      double limit, purch, todayPurch, total, newTotal;
      limit = 1000;
      
      //prompt user input
      System.out.print("Enter Purchases to Date: \t");
      purch = keyboardIn.nextDouble();
      System.out.print("Enter Today's Purchases: \t");
      todayPurch = keyboardIn.nextDouble();
      total = purch + todayPurch;
      newTotal= limit - total;
      
      //determine if credit limit is exceeded or not
      if(total >1000)
      {
               System.out.print("Credit Limit: \t \t \t" + limit);
               System.out.print("\nEnter Purchases to Date: \t"+ purch);
               System.out.print("\nEnter Today's Purchases: \t" + todayPurch);
               System.out.println("\nCredit Limit exceeded by " + newTotal);
      }
      else
      {
               System.out.print("Credit Limit: \t \t \t" + limit);
               System.out.print("\nEnter Purchases to Date: \t"+ purch);
               System.out.print("\nEnter Today's Purchases: \t" + todayPurch);
               System.out.println("\nCredit Limit is under by  " + newTotal);
      }
   }
}