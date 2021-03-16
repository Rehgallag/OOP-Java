// Practical 2A - Question 3
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q3ReturnHighest{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num1, num2, highest;
      
      System.out.print("Please enter the first number: ");
      num1 = in.nextInt();
      
      System.out.print("Please enter the second number: ");
      num2 = in.nextInt();
      
      highest = getHighest(num1, num2);
      System.out.print("The highest number is: " + highest);
   }
   
   public static int getHighest(int no1, int no2){
      if(no1 > no2){
         return no1;
      }
      else{
         return no2;
      }
   }
}