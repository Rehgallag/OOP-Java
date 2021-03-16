/* 
  Practical 19 - Question 2
  Eleanor Birrell
  3 December 2019
  Program to find lotto number
*/

import java.util.Scanner;
public class Lotto
{
   public static void main(String[] args)
   {
   
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] lotto = {2, 4, 7, 15, 21, 23};
      int searchValue = 0, position = 0;
      boolean found = false;
      
      System.out.print("Enter the value to search for: ");
      searchValue = keyboardIn.nextInt();
   
      for(int i = 0; i < lotto.length; i++)
      {
         if(lotto[i] == searchValue) 
         {
            position = i; 
            found = true;
         }
      }
      if(found)
      {
         System.out.print("Number found: " + position);
      }
      else
      {
         System.out.print("Number not found");
      }
   }
}