// Practical 11B- Question 1
// John Gallagher
// 5 December 2019
// Program to display result on screen

import java.util.Scanner;

public class Store_Months_And_Days_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      int num=0;
      
      String[] months= {"January", "February", "March", "April", "May", "June", "July","August","September","October","November","December"};
      
      System.out.print("Enter month number [1 to 12]: [enter -1 to stop]: ");
      num=in.nextInt();
      
      for(int i=0;i<months.length;i++)
      {
         System.out.print(months[i] + " ");
         switch(months[i])
         {  
             case "January" :System.out.print(" has 31 days");
                     break;
             case "February": System.out.print("  has 28 days");
                     break;
             case "March": System.out.print(" has 31 days");
                     break;
             case "April": System.out.print(" has 30 days");
                     break;
             case "May": System.out.print(" has 31 days");
                     break;
             case "June": System.out.print(" has 30 days");
                     break;
             case "July": System.out.print(" has 31 days");
                     break;
             case "August": System.out.print(" has 31 days");
                     break;
             case "September": System.out.print(" has 30 days);
                     break;
             case "October": System.out.print(" has 31 days);
                     break;
             case "November": System.out.print("  
             case "April": 
             case "June": System.out.println("  has 30 days");
                     break;
             default: System.out.println("  has 31 days ");
         }
       }
      
      if(num==-1)
      {
         System.out.print("Goodbye");
      }
   }
}



//look at Q 2
//parallel array