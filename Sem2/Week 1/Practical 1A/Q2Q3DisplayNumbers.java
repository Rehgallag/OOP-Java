// Practical 1A- Question 2 & 3
// John Gallagher
// 21 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q2Q3DisplayNumbers{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int num1, num2;
      System.out.print("Input number 1: ");
      num1=in.nextInt();
      System.out.print("Input number 2: ");
      num2=in.nextInt();
      displayNumbers(num1, num2);
   }
   
   public static void displayNumbers(int n1, int n2){
      for(int i=n1;i<=n2;i++){
         System.out.println(i);
      }
   }
}