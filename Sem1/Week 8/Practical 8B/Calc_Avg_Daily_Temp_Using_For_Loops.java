/* Practical 8B- Question 1
   John Gallagher
   14 November 2019
   Program to display result on screen
*/

import java.util.Scanner;

public class Calc_Avg_Daily_Temp_Using_For_Loops 
{
   public static void main(String[] args) 
   {
      //create a scanner  
      Scanner in = new Scanner(System.in);
      int n=7;
      double avg, temp,total=0;
      
      for(int i=1; i<=n; i++)
      {
         System.out.print("Enter the temp of each day of the week: ");
         temp = in.nextDouble();
         //add temp to total
         total = total + temp;
      }
      //calc avg
      avg = (double)total/n;
      //display avg
      System.out.print("Average temp of the week is: " + avg);
   }// end main method
}// end class



