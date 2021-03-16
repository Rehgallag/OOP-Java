// Practical 1B- Question 1
// John Gallagher
// 23 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1CountdownMethods{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int num1=0;
      int num2=0;
      System.out.print("Enter a number to countdown from: ");
      num1=in.nextInt();
      System.out.print("Enter a number to countdown to: ");
      num2=in.nextInt();
      count(num1, num2);
     } 
      public static void count(int n1, int n2){
         for(int i=n1;i>=n2;i--){
            System.out.println(i);
         }
      }
   
}
