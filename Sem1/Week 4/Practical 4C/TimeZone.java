// Practical 4C- Question 2
// John Gallagher
// 10 October 2019
// Program to display result on screen

import java.util.Scanner;

public class TimeZone
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int hrs, mins;
      
      System.out.print("Enter the hours [In 24hr format]: ");
      hrs = in.nextInt();
      
      System.out.print("Enter the time [0-60]: ");
      mins = in.nextInt();
      
      if(hrs < 0 || hrs > 24)
      {  
               System.out.print("Invalid input");      
      } 
      if(mins < 0 || mins > 60)
      {
               System.out.print("Invalid input");
      }
      System.out.print("The time in New York is " + (hrs - 5) + ":" + mins);
      System.out.println("The time in San Fransicso is " + (hrs - 8) + ":" + mins);
      System.out.println("The time in Sydney is " + (hrs + 10) + ":" + mins);
   }
}