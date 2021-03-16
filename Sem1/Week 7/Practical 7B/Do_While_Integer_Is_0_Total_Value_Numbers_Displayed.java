// Practical 7B- Question 3
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Do_While_Integer_Is_0_Total_Value_Numbers_Displayed
{
   public static void main(String args[])
   {
      //declare Scanner
      Scanner in = new Scanner(System.in);
      int num, total=0;
      
      System.out.print("Enter a number: ");
      num = in.nextInt();
      
      do{
         if(num !=0) total = total + num;
         System.out.print("Enter a number: ");
         num = in.nextInt();
         
      }
      while(num !=0);
      
      System.out.println(total);
   }
}