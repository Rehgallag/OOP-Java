// Practical 6A - Question 2
// John Gallagher
// 25 February 2020 
// Program to display result on screen

import java.util.*;

public class Q2HighestBalanceBetween2Acc {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BankAccount accOne = new BankAccount();
      BankAccount accTwo = new BankAccount();
      
      System.out.print("Please enter how much you want to deposit in Account 1: ");
      accOne.deposit(in.nextDouble());
      
      System.out.print("\nPlease enter how much you want to deposit in Account 2: ");
      accTwo.deposit(in.nextDouble());
      
      if(accOne.getBalance() > accTwo.getBalance()) {
         System.out.println("\nAccount 1 has the higher amount with: " + accOne.getBalance());
      }
      else if(accTwo.getBalance() > accOne.getBalance()) {
         System.out.println("\nAccount 2 has the higher amount with: " + accTwo.getBalance());
      }
      else {
         System.out.println("\nAccount 1 and Account 2 have equal balances.");
      }
   }
}