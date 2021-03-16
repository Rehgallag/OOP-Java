/* 
  Practical 20 - Question 4
  Eleanor Birrell
  5 December 2019
  Program to find number
*/

import java.util.Scanner;
public class FindNumber
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
            break;
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