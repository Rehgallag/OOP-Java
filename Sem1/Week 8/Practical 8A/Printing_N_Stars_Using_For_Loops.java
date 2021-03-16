// Practical 8A- Question 3
// John Gallagher
// 12 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_N_Stars_Using_For_Loops
{
   public static void main(String [] args)
   {
      // create a scanner object
      Scanner in = new Scanner(System.in);
      
      int n;
      
      // prompt input
      System.out.print("Please enter a number: ");
      n = in.nextInt();
      
      for(int i=1; i<=n; i++)
      {
         System.out.print("*");
      }
   }
}