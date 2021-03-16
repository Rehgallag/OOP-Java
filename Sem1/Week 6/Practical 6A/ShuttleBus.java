// Practical 6A- Question 1
// John Gallagher
// 22 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ShuttleBus
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int hrs, mins, waitTime;
      
      System.out.print("Enter the hours: ");
      hrs = in.nextInt();
      
      System.out.print("Enter the minutes: ");
      mins = in.nextInt();
      
      System.out.println("The time is " + hrs +":" + mins + ".");
      
      
      if(mins > 30)
      {
               hrs = hrs + 1;
               waitTime = 60 - mins;
               System.out.println("The bus will arrive in " + waitTime + " mins. ");
               System.out.println("The next bus is scheduled to arrive for " + hrs + ":00");
      }
      else if (mins < 30)
      {
               waitTime = 30 - mins;
               System.out.println("The bus will arrive in " + waitTime + " mins. ");
               System.out.println("The next bus is scheduled to arrive for " + hrs + ":30");      
      }
      
    
      
      







   }
}