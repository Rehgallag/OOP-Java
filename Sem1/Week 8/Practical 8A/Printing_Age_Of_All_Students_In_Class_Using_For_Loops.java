// Practical 8A- Question 8
// John Gallagher
// 12 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Age_Of_All_Students_In_Class_Using_For_Loops
{
   public static void main(String [] args)
   {
      // create a scanner
      Scanner in = new Scanner(System.in);
      
      int n=0,age=0, num=0;
      double avg;
      
      System.out.print("Enter the amount of students in the class: ");
      n = in.nextInt();
      
      // print age on screen
      for(int i=1; i<=n; i++)
      {
         System.out.print("Enter your age: ");
         age = in.nextInt();
         num = num + age;
         
      }
      // calc average
      avg = (double)num/n;
      // display average
      System.out.print("Average age is " +avg);
   }
}
