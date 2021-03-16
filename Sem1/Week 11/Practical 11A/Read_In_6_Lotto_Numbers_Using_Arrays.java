// Practical 11A- Question 2
// John Gallagher
// 3 December 2019
// Program to display result on screen

import java.util.Scanner;

public class Read_In_6_Lotto_Numbers_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declare an array to hold ten prices
      int[] num = {6,7,19,22,25,46};
      int searchValue;
      int position = -1; 
      
      System.out.print("Enter the value to search for: ");
      searchValue = in.nextInt();
      
      //search the array for the search value
      for(int i=0;i<num.length;i++)
      {
         if(num[i] == searchValue) //if match found
         {
            position = i; //store position
         }
      }
      if(position != -1) //if value of position has changed
      {
         System.out.print("Value found at position: " + position);
      }
      else
      {
         System.out.print("Value NOT found ");
      }
   }
}