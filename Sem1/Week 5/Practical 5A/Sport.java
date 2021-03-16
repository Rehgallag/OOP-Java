// Practical 5A- Question 2
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Sport
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter you name: ");
      String sport = in.nextLine();
      
      switch(sport)
      {
         case "Tennis": case "Badminton":
               System.out.print("No. in team: 1");
               break;
         case "Basketball":
               System.out.print("No. in team: 2");
               break;
         case "Hurling": case "Football":
               System.out.print("No. in team: 15");
               break;
         case "Soccer":
               System.out.print("No. in team: 11");
               break;
         default: System.out.print("Unknown sport");


      }
   }
}