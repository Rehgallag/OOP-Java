// Practical 3B- Question 3
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class ConvertTime
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      int  totalTime = 0;
      int  timeInSeconds ;
      int  timeInMinutes ;
      int  timeInHours ;
      
      //get total time from user
      System.out.print("Enter time in seconds: ");
      totalTime = keyboardIn.nextInt();
      
      if(totalTime < 60)
      {
               System.out.println(totalTime + " seconds");
      }
      else
      {
      //convert to time in hours, minutes, seconds
      timeInSeconds = totalTime % 60;
      totalTime = totalTime / 60;
      timeInMinutes = totalTime % 60;
      totalTime = totalTime / 60;
      timeInHours = totalTime % 60; 
   
      //print out the detial
      System.out.println("Time is " + timeInHours + ":" + timeInMinutes ":" + timeInSeconds );
      }
   }
}