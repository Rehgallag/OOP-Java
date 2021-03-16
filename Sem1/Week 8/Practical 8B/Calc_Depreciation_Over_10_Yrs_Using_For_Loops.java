/* Practical 8B- Question 2
   John Gallagher
   14 November 2019
   Program to display result on screen
*/

public class Calc_Depreciation_Over_10_Yrs_Using_For_Loops
{
   public static void main(String[] args)
   {
      int value=17000, year=10, dep=1500;
      
      //print depreciation
      for(int i=0; i<=year; i++)
      {
         //display the reducing value
         System.out.println("Year " + i + ": " + (value - (i*dep)));     
      }
 
   }
}