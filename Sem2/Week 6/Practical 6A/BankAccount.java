/*******************************
	Written by: John Gallagher
	Date : 		
	Desc :	program to implement a simple BankAccount	
	Filename:	
*****************************/
/*

*/
public class BankAccount
{
   //instance variables
   private int num;
   private double balance; 
   private int accountNumber;
   
   //methods
   public BankAccount() { //PRACTICAL 7B Q1 ADAPT
      balance = 0.0;
      num++;
      accountNumber = num;
   }
   
   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }
   
   //return the balance of BankAccount
   public double getBalance()
   {
      return balance;     
   }
   
   //reduces balance by amount
   public void withdraw(double amount)
   {
      if(amount > balance) {
         System.out.println("Insufficient funds.");
      } 
      else{
         balance = balance - amount;
      }
   }
   
   //increases balance by amount
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   public int getAccountNumber() {
      return accountNumber;
   }
   
   public void setAccountNumber(int num) {
      accountNumber = num;
   }
}//end class