/* GET fuel
   GET litres
   Calc costOfFuel(litresBought * fuel( 1.44 for Petrol or 1.35 for Diesel))
   
   GET coffee
   CALC price
   
   IF total >= 20
      Multiply .2 by coffee
      
   ElSE
      DISPLAY total
      
   DISPLAY Fuel Cost
   DISPLAY Coffee
   DISPLAY Discount
   DISPLAY Paid
   DISPLAY Change
   

 John Gallagher
 24 October 2019
 Program to display result on screen
*/

import java.util.Scanner;

public class PseudocodeJava
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int petrol, diesel, fuel;
      final double costP = 1.44, costD = 1.35;
      double disc, total, paid, change, litres;
   
      System.out.print("Enter 1 for Petrol or 2 for Diesel: ");
      fuel = in.nextInt();
   
      if(fuel == 1)
      {
               System.out.println("How many litres of petrol? " + litres);
               litres = in.nextDouble();
      }
      else if(fuel == 2)
      {
               System.out.printlm("How many litres of diesel? " + litres);
      }
      else
      {
               System.out.print("Invalid input, please enter 1 or 2");
      }

   }


}