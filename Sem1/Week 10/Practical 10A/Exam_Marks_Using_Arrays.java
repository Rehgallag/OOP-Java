// Practical 10A- Question 1
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Exam_Marks_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declare an array of 6 ints
      int[] marks = new int[6]; 
      marks[0]=75;
      marks[1]=28;
      marks[2]=56;
      marks[3]=100;
      marks[4]=4;
      marks[5]=65;
      
      for(int i=0;i<marks.length;i++)
      {
         System.out.print(marks[i] + " ");
      }
   }
}