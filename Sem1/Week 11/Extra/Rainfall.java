/* 
  Practical 19 - Question 7 - 8
  Eleanor Birrell
  3 December 2019
  Program to display rainfall
*/

import java.util.Scanner;
public class Rainfall
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
   
      double[] rainfall = new double[]{50, 56, 65, 63, 63, 78, 71, 72, 58, 62, 73, 55};
      String [] months = new String [] {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
      int lessThan = 0, greaterThan = 0;
      
      for(int i = 0; i < rainfall.length; i++)
      {
         if(rainfall[i] < 60)
         {
            lessThan++;
         }
         
         else if(rainfall[i] > 70)
         {
            greaterThan++;
         }
     }
        System.out.println(+lessThan +" months rainfall was less than 60 mm");
        System.out.println(+greaterThan +" months rainfall was greater than 70 mm");
        System.out.println(" ");
        
        for(int i = 0; i < rainfall.length; i++)
      {
         System.out.println(months[i] +": " +rainfall[i]);
      }
         
      }
      
}