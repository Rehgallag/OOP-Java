// Practical 10A- Question 3
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Prices_Using_Arrays
{
   public static void main(String[] args)
   {
      //declare prices
      double [] price = {12.99,15.00,9.5,130.00,2.99};
      
      for(int i=0;i<price.length;i++)
      {
         System.out.print(price[i] + " ");
      }

   }
}