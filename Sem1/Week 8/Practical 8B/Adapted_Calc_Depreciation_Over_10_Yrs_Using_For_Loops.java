/* Practical 8B- Question 3
   John Gallagher
   14 November 2019
   Program to display result on screen
*/

import java.util.Scanner;

public class Adapted_Calc_Depreciation_Over_10_Yrs_Using_For_Loops
{
   public static void main(String[] args)
   {
      //create a scanner 
      Scanner in=new Scanner(System.in);
      int n=0;
      double dep=0,value=0,temp=0;
      
      System.out.println("Enter value");
      value=in.nextDouble();
      
      System.out.println("Enter Depreciation percentage");
      dep=in.nextDouble();
      
      System.out.println("Enter  number of years");
      n=in.nextInt();
      
      temp=value;
      
      for(int i=0;i<=n;i++)
      {
         temp=((100-dep)*temp)/100;
         System.out.println("After depreciation year " + i + ":" +temp);
      }
   }
}