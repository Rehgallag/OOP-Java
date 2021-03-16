// Practical 4B- Extra Practice Question 
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class PayRate
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      
      double hrsWorked = 0, rate = 0, normalPay, extra, extra1, extra2;
      
      System.out.print("Please enter the number of hours worked in the week: ");
      hrsWorked = in.nextDouble();
      
      System.out.print("Please enter the rate of pay per hour: ");
      rate = in.nextDouble();
      
      normalPay = hrsWorked * rate;
      extra = normalPay * .1;
      extra1 = normalPay * .15;
      extra2 = normalPay * .2;
      
         if ( hrsWorked < 37 && hrsWorked > 0)
         {
                  System.out.print("Your total pay due is: " + normalPay);
         }
         else if ( hrsWorked > 37 && hrsWorked < 40)
         {
                  System.out.print("Your total pay due is: " + (normalPay + extra));
         }
          else if ( hrsWorked > 40 && hrsWorked < 40)
         {
                  System.out.print("Your total pay due is: " + (normalPay + extra1));
         }
          else if ( hrsWorked > 45)
         {
                  System.out.print("Your total pay due is: " + (normalPay + extra2));
         }

   }
}