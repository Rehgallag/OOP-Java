// Practical 10B- Question 4
// John Gallagher
// 28 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Storing_Peoples_Heights_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //find length of array of people
      System.out.print("How many people?: ");
      int ppl=in.nextInt();
      
      double[] height=new double[ppl];
      
      for(int i=0;i<height.length;i++)
      {
         System.out.print("Enter person no."+(i+1)+ " height: ");
         height[i] = in.nextDouble();
      }
      
      System.out.println("The heights og the people were: ");
      for(int i=0;i<height.length;i++)
      {
         System.out.println(height[i]);
      }

      
   }
}