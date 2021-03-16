// Practical 7B- Question 1
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Do_While_Integer_Is_0
{
   public static void main(String args[])
   {
      //declare Scanner
      Scanner in = new Scanner(System.in);
      int num;
      
      System.out.print("Enter an integer: ");
      num = in.nextInt();
      
      while(num !=0)
      {
            System.out.print("Enter an integer: ");
            num = in.nextInt();
      }
      
   }
}