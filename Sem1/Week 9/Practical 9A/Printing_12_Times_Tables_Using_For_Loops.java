// Practical 9A- Question 7
// John Gallagher
// 19 November 2019
// Program to display result on screen

import java.util.Scanner;
 
public class Printing_12_Times_Tables_Using_For_Loops 
{
   public static void main(String[] args) 
   {
   Scanner in = new Scanner(System.in);
   
   int num = 12;
   
   for (int i=0; i<12; i++)
   {
      System.out.println(num + " x " + (i+1) + " = " + 
      (num * (i+1)));
   }
 }
}
