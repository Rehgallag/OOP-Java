// Practical 10A- Question 7
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Whether_A_Day_Is_A_Weekday_Or_Weekend_Using_Arrays
{
   public static void main(String[] args)
   {
      String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      
      for(int i=0;i<days.length;i++)
      {
         System.out.print(days[i] + " ");
         switch(days[i])
         {  
             case "Saturday": 
             case "Sunday": System.out.println(" - weekend");
                     break;
             default: System.out.println(" - weekday ");
         }
       }
   }
}
