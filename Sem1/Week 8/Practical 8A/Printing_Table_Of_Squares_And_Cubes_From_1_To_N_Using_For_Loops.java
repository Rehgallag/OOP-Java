// Practical 8A- Question 11
// John Gallagher
// 12 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Table_Of_Squares_And_Cubes_From_1_To_N_Using_For_Loops
{
   public static void main(String [] args)
   {
      // create a scanner
      Scanner in = new Scanner(System.in);
      
      int n;
      
      System.out.print("Please enter a number: ");
      n = in.nextInt();
      
      // print
      for(int i=1;i<=n;i++)
      {
         System.out.print("Number " +"\n"+ i);
         System.out.print(" Square " +i*i);
         System.out.print(" Cube " +i*i*i);         
      }
   }   
}

