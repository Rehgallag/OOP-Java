// Practical 2A - Question 5
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q5Redo{
   public static void main(String[]args){
   Scanner in = new Scanner(System.in);
      //declare variables
      double interestEarned;
      double amount, interestRate, interest;
      int years;
      //get user input
      System.out.print("Please enter the amount: ");
      amount = in.nextDouble();
      System.out.print("Please enter the number of years: ");
      years = in.nextInt();
      System.out.print("Please enter the interest rate: ");
      interestRate = in.nextDouble();

      //call method

      for(int i=1;i!=0;){
      interestEarned = calcCompoundInterest(amount, years, interestRate);
      //display interest
      System.out.println("The interest Earned is " + interestEarned);
      //ask to continue
      System.out.print("If you don't want to carry out another calculation, enter 0, otherwise enter 1:");
      i = in.nextInt();
      }
   }//end of main method
   
   public static double calcCompoundInterest(double amount, int years, double interestRate){
      double interest;
      //calculate interest
      interest = amount*(years*interestRate);
      //return value
      return interest;
      
   } 
}//end of class