// Practical 5A- Extra Practice Question
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class DayOfTheWeek
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int day;
      
      System.out.print("Enter a day [1 to 7] : ");
      day = in.nextInt();
      
      switch(day)
      {
         case 1: 
               System.out.print("The day is Monday");
               break;
         case 2: 
               System.out.print("The day is Tuesday");
               break;
         case 3: 
               System.out.print("The day is Wednesday");
               break;
         case 4: 
               System.out.print("The day is Thursday");
               break;
         case 5: case 6: case 7:
               System.out.print("The weekend is here!");
               break;
         default: System.out.print("Incorrect Day");
         
      }

   }
}