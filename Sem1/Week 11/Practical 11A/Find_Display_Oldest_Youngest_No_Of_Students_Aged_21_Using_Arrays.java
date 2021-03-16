// Practical 11A- Question 4
// John Gallagher
// 3 December 2019
// Program to display result on screen

import java.util.Scanner;

public class Find_Display_Oldest_Youngest_No_Of_Students_Aged_21_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);

      int[] age=new int[7];
      int target, count = 0;
      
      for(int i=0;i<age.length;i++)
      {
         System.out.print("Enter student no."+(i+1)+ " age: ");
         age[i] = in.nextInt();
      }
      double oldest=age[0];
      double youngest=age[0];
      for(int i = 0; i < age.length; i++)
      {
         if(age[i]>oldest)
         {
            oldest= age[i];
         }
      }
      
      System.out.print("\nThe oldest student is: " + oldest); 
      //get the coolest
      for(int i = 0; i < age.length; i++)
      {
         if(age[i]<youngest)
         {
            youngest= age[i];
         }
      }
      
      System.out.print("\nThe youngest student is: " + youngest);    
      
      //count how many students are aged 21
      //get target value
      System.out.print("\nEnter Search value: " );
      target = in.nextInt();
      
      // loop through the array, counting matches
      for(int i = 0; i < age.length; i++)
      {
         if(target == age[i])
         count++;
      }
      System.out.print(target +" occurs " +count +" times" );
   }
}