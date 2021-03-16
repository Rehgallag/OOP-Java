// Practical 1A- Question 1
// John Gallagher
// 21 January 2020 Semester 2
// Program to display result on screen

import java.util.Scanner;

public class Q1MethodExNumbers{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int num1, num2;
      System.out.print("Input number 1: ");
      num1=in.nextInt();
      System.out.print("Input number 2: ");
      num2=in.nextInt();
      printSmaller(num1, num2);
   } //end main method
   
   public static void printSmaller(int n1, int n2){
      if (n1<n2)
         System.out.print("Smallest is: " + n1);
      else
         System.out.print("Smallest is: " + n2);
   }      
}