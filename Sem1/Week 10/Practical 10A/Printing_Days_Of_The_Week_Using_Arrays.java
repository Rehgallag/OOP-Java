// Practical 10A- Question 6
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Days_Of_The_Week_Using_Arrays
{
   public static void main(String[] args)
   {
      String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      
      //print out the days in order
      for(int i=0; i<days.length;i++)
      {
         System.out.print(days[i] + " ");
      } 
      //print a black space
      System.out.print("\n");
     
      //print out the days in reverse order
      for(int i=days.length-1;i>=0;i--)
      {
         System.out.print(days[i] + " ");
      } 
   }
}