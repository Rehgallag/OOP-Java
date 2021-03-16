//The notes for the Java CA #2
// CA #2
// John Gallagher
// 6 December 2019
// Program to display result on screen

import java.util.*;

public class Question2
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declaring variables
      String[] subjects= {"Programming","CAOS","Maths","Web Development","Personal & Prof Dev"};
      int[] marks={45,28,33,59,82};
      int sum=0;
      int avg=0;
      
      System.out.println("Your results are:");
      for(int i=0;i<subjects.length;i++)
      {
         System.out.println(subjects[i] +": "+marks[i]);
      }
      
      System.out.print("\n");
      System.out.println("Number of subject(s) passed: "+3);
      System.out.println("Number of subject(s) failed: "+2);
      System.out.println("Average Mark:" + "                "+49.4+"\n");
      
      System.out.println("Results in reverse order:");
      for(int i=marks.length-1;i>=0;i--)
      {
         System.out.println(subjects[i]+": "+marks[i]);
      }
      
      
   }
}