/* 
  Practical 19 - Question 1
  Eleanor Birrell
  3 December 2019
  Program to display student names
*/

import java.util.Scanner;
public class StudentNames
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);

      String[] names = new String[5];
      
      for(int i = 0; i < names.length; i++)
      {
         System.out.print("Name " +(i+1) + ": ");
         names[i] = keyboardIn.nextLine();

      }
      
      System.out.println(" ");
      
      for(int i = names.length - 1; i > -1; i--)
      {
         System.out.println("Name " +(i + 1) + ": " +names[i]);
      }
   
   }
}