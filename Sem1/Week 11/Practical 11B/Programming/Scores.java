/* 
  Practical 20 - Question 3
  Eleanor Birrell
  5 December 2019
  Program to display team scores
*/

import java.util.Scanner;
public class Scores
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int won = 0, draw = 0, lost = 0;
      int [] home = new int [] {3, 0, 1, 0, 1, 3};
      int [] away = new int [] {1, 3, 0, 1, 0, 3};
      
      for(int i = 0; i < home.length; i++)
      {
         if(home[i] == 3)
         {
            won++;
         }
         
         else if(home[i] == 1)
         {
            draw++;
         }
         
         else if(home[i] == 0)
         {
            lost++;
         }
      }
      
      for(int i = 0; i < away.length; i++)
      {
         if(away[i] == 3)
         {
            won++;
         }
         
         else if(away[i] == 1)
         {
            draw++;
         }
         
         else if(away[i] == 0)
         {
            lost++;
         }
         
      }
      
      System.out.println("Won: " +won);
      System.out.println("Drew: " +draw);
      System.out.println("Lost: " +lost);
      
   }
   
}
