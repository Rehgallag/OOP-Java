// Practical 11A- Question 5
// John Gallagher
// 3 December 2019
// Program to display result on screen

import java.util.*;

public class Store_Heights_Of_5_Students_Using_Parallel_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //create 2 arrays
      String[] name = new String[5];
      double[] height = new double[5];
      double userHeight = 0;
      int count = 0;
      
      //Read values into array1
      System.out.println("Your Height: ");
      userHeight = in.nextDouble();
      in.nextLine();
      System.out.println("Enter 5 names: ");
      for(int i = 0; i<name.length; i++)
      {
         System.out.print("Name " +(i+1) +": ");
         name[i] = in.nextLine();
      }
      for(int i = 0; i<height.length; i++)
      {
         System.out.print("Height " +(i+1) +": ");
         height[i] = in.nextDouble();
      }

      for(int i = 0; i<name.length; i++)
      {
         System.out.println(name[i] + " " + " " + height[i]);
      }

      System.out.println("\nStudents above 1.6");

      for(int i = 0; i<height.length; i++)
      {
         if (height[i] > 1.6)
         {
            System.out.println(name[i] + " " + " " + height[i]);
         }
      }

      //FOR QUESTION 6
      for(int i = 0; i<height.length; i++)
      {
         if (userHeight < height[i])
         count++;
      }

      System.out.println("\n" + count + " are taller than your height");


   }
}