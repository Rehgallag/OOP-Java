// Practical 10B- Question 7
// John Gallagher
// 28 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Enter_What_Month_You_Want_Using_Arrays
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter a month number: ");
      
     
       {
         int no=in.nextInt;
         String [] months = {"January","February","March","April","May","June","July","August","September","October","November","Decmeber"};
         System.out.print(months[no]);
       }
   }
}