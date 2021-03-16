// Practical 10A- Question 4
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Reading_In_Prices_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      double[] price = new double[5];
      double sum=0;
      
      //get the 5 prices
      System.out.println("Enter the price:  ");
      for(int i=0;i<price.length;i++)
      {
         System.out.print("Price " + (i+1)+": ");
         price[i]=in.nextDouble();
      }
      //display the 5 prices
      System.out.println("The prices");
      for(int i=0;i<price.length;i++)
      {
         System.out.println("Price "+(i+1)+": " +price[i]);
      }
      //get and display the total
      for(int i=0;i<price.length;i++)
      {
         sum = sum + price[i];
      }
      System.out.print("The total price is: "+sum);
   }
}