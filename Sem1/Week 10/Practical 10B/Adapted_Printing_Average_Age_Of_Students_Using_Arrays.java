// Practical 10B- Question 6
// John Gallagher
// 28 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Adapted_Printing_Average_Age_Of_Students_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      double sum=0;
      double avg=0;
      
      //get no of students
      System.out.print("How many students?: ");
      int students=in.nextInt();
      
      int[] age=new int[students];
      
      for(int i=0;i<age.length;i++)
      {
         System.out.print("Enter student no."+(i+1)+ " age: ");
         age[i] = in.nextInt();
      }
      //display the 5 ages
      System.out.println("Students age:");
      for(int i=0;i<age.length;i++)
      {
         System.out.println("Age "+(i+1)+": "+age[i]);
      }
      //get and display the average
      for(int i=0;i<age.length;i++)
      {
         sum = sum + age[i];
      }

      avg = sum/age.length;
      System.out.print("The avg age of the 5 students is: ");
      System.out.printf("%.2f", avg);

   } 
}