// Practical 11A- Question 1
// John Gallagher
// 3 December 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_5_Students_Names_In_Reverse_Order_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      String[] beatles = {"John", "Paul", "George", "Ringo","Lenny"};
      
      for(int i=beatles.length-1;i>=0;i--)
      {
         System.out.println(beatles[i]+ " ");
      }
   }
}