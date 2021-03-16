/* 
  Practical 19 - Question 5 - 6
  Eleanor Birrell
  3 December 2019
  Program to display student heights
*/

import java.util.Scanner;
public class StudentHeights
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   
      double[] heights = new double[]{2.0, 1.8, 1.5, 1.5, 1.4};
      String[] names = new String[]{"Allan", "Sean", "Edie", "Ellie","Edie"};
      double userHeight = 0;
      int count = 0;
      
      System.out.print("Your height: ");
      userHeight = keyboardIn.nextDouble();
      
      System.out.println(" ");
      
      System.out.println("Student heights");
      for(int i = 0; i<heights.length; i++)
      {
         System.out.println(names[i] +": " +heights[i]);
      }
      
      System.out.println("\nAbove 1.6");
      
      for(int i = 0; i<heights.length; i++)
      {
         if (heights[i] > 1.6)
         {
            System.out.println(names[i] +": " +heights[i]);
         }
      }
      
      for(int i = 0; i < heights.length; i++)
      {
         if(userHeight < heights[i])
         {
            count++;
         }
      }
      
      System.out.println("\n"+count +" students are taller than your height");
   }
}