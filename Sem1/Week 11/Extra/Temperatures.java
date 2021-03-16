/* 
  Practical 19 - Question 3
  Eleanor Birrell
  3 December 2019
  Program to display average temperature
*/

import java.util.Scanner;
public class Temperatures
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      double[] temps = new double[7];
      double average = 0, total = 0;

      for(int i = 0; i< temps.length; i++)
      {
         System.out.print("Noonday temperature day " +(i+1)+": ");
         temps[i] = keyboardIn.nextDouble();
         total +=temps[i];
      }
      
      double hottest = temps[0];
      double coldest = temps[0];
      
      for(int i = 0; i < temps.length; i++)
      {
         if(temps[i] > hottest)
         {
            hottest = temps[i];
         }
      }
      
      for(int i = 0; i < temps.length; i++)
      {
         if(temps[i] < coldest)
         {
            coldest = temps[i];
         }
      }
   
      
      average = total/temps.length;
      System.out.println("Average temperature: " +average);
      System.out.println("Hottest temperature: " +hottest);
      System.out.println("Coldest temperature: " +coldest);
   }
}