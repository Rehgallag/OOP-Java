/* 
  Practical 20 - Question 2
  Eleanor Birrell
  5 December 2019
  Program to display average temperature
*/

import java.util.Scanner;
public class Temperatures
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      double[] temps = new double[] {8, -1, -4, -2, 1, -1, 4};
      String [] days = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      
      for(int i = 0; i< temps.length; i++)
      {
         if(temps[i] < 0)
         {
         System.out.println(days[i] +" " + temps[i] +" Freezing");
         }
         
         else
         {
         System.out.println(days[i] +" " + temps[i]);
         }
      }
      
   }
   
}