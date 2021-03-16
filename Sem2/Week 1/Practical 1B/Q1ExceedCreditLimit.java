// Practical 1C- Question 1
// John Gallagher
// 24 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1ExceedCreditLimit{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      double balance, purchases;
      
      System.out.print("Enter your previous account balance: ");
      balance=in.nextDouble();
      
      System.out.print("Enter your total purchases: ");
      purchases=in.nextDouble();
      
      displayAccount(balance, purchases); //call method
   }
   
   public static void displayAccount(double bal, double purch){
      double total;
      total=bal+purch;
      
      System.out.println();
      System.out.println("Credit Limit:             1000");
      System.out.println("Purchases to Date:        " + bal);
      System.out.println("Today's Purchases:        "+ purch);
      System.out.println();
      if(total>1000){
         System.out.print("Credit limit exceeded by: "+(total-1000));
      }
   }
}