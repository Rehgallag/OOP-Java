/* 
  Practical 19 - Question 4
  Eleanor Birrell
  3 December 2019
  Program to display student ages
*/

import java.util.Scanner;
public class StudentAges
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      int[] ages = new int[7];
      int count = 0;
      
      for(int i = 0; i < ages.length; i++)
      {
         System.out.print("Age " +(i+1) + ": ");
         ages[i] = keyboardIn.nextInt();
      
      }
      
      int youngest = ages[0];
      int oldest = ages[0];
      
      for(int i = 0; i < ages.length; i++)
      {
         if(ages[i] < youngest)
         {
            youngest = ages[i];
         }
      }
      
      for(int i = 0; i < ages.length; i++)
      {
         if(ages[i] > oldest)
         {
            oldest = ages[i];
         }
      }
   
      
      for(int i = 0; i < ages.length; i++)
      {
         if(21 == ages[i])
            count++;
      }
      
      System.out.println("Youngest student: "+youngest);
      System.out.println("Oldest student: "+oldest);
      System.out.println("21 year olds: "+count);
      
   }
}