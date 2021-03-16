// Practical 1A- Question 6
// John Gallagher
// 21 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q6EmployeePay{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      double miles=0, allowance=0;
      System.out.print("Enter the miles travelled: ");
      miles=in.nextDouble();
      System.out.print("Enter the allowance: ");
      allowance=in.nextDouble();
      calcExpenses(miles, allowance);
   }
   
   public static void calcExpenses(double miles, double allowance){
      Scanner in=new Scanner(System.in);
      double expenses;
      expenses= miles*allowance;
      
      if(miles>150){
         expenses=expenses+100;
      }
      System.out.print("The total expenses payable is: "+expenses);
      
      
   }
}