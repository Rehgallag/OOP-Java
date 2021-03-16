// Practical 9A- Question 4
// John Gallagher
// 19 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Col_And_Row_Input_Using_Nested_Loops
{
   public static void main(String[] args)
   {
      //create a scanner object
      Scanner in=new Scanner(System.in);
      char input;
      int r,c;
      System.out.print("Input a character: ");
      input=in.next().charAt(0);;

      System.out.print("Input number of rows: ");
      r=in.nextInt();
      
      System.out.print("Input number of columns: ");
      c=in.nextInt();
      
      for(int i=1;i<=r;i++)
      {
         for(int o=1;o<=c;o++)
         {
            System.out.print(input);
         }
         System.out.println();

      }
      
   }
}