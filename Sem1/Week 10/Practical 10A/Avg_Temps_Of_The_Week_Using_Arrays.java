// Practical 10A- Question 5
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Avg_Temps_Of_The_Week_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      double[] temps = new double[7];
      double sum=0;
      double avg=0;
      
      //get the daily temperature for the week
      System.out.println("Enter the temperature:  ");
      for(int i=0;i<temps.length;i++)
      {
         System.out.print("Day "+(i+1)+": ");
         temps[i]=in.nextDouble();
      }
      //display the daily temperatures for the week
      System.out.println("Daily temperatures");
      for(int i=0;i<temps.length;i++)
      {
         System.out.println("Day "+(i+1)+": "+temps[i]);
      }
      //get and display the average
      for(int i=0;i<temps.length;i++)
      {
         sum = sum + temps[i];
      }
      avg = sum/temps.length;
      System.out.print("The avg temperature of the week is: ");
      System.out.printf("%.2f", avg);
   }
}