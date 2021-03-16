// Practical 10B- Question 3
// John Gallagher
// 28 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_Student_Names_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //find length of array of studentNames       
      System.out.print("How many students?: ");
      int students=Integer.parseInt(in.nextLine());
            
      String[] studentNames=new String[students]; 

      for(int i=0;i<studentNames.length;i++)
      {
         System.out.print("Enter student names:");
         studentNames[i] = in.nextLine();
      }
      
      for(int i=0;i<studentNames.length;i++)
      {
         System.out.println(studentNames[i]);
      }
   }
}