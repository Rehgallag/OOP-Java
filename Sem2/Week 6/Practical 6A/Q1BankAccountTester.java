// Practical 6A - Question 1
// John Gallagher
// 25 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1BankAccountTester {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BankAccount myAcc = new BankAccount();
      
      myAcc.deposit(250.00);
      myAcc.withdraw(240.00);
      System.out.println("Balance: "+ myAcc.getBalance());
      
      System.out.println("Enter a number: "+myAcc.setAccountNumber(in.nextInt());
      System.out.println("Account number: "+ myAcc.getAccountNumber());
      
      
   }
}