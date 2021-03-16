// Practical 9A- Question 3
// John Gallagher
// 19 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Integer_Input_Asterisks_Using_Nested_Loops 
{

   public static void main(String[] args) 
   {
      //create a scanner object
      Scanner in=new Scanner(System.in);
      
      int n;
      
      System.out.print("How many stars do you wish to see? ");
      n=in.nextInt();
      
       for(int i=1;i<=n;i++) 
      {
         for(int o=1;o<=n;o++)
         {
            System.out.print("*");
         }
         System.out.println();
      }  

   }
}