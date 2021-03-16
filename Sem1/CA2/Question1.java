//The notes for the Java CA #2
// CA #2
// John Gallagher
// 6 December 2019
// Program to display result on screen

import java.util.*;

public class Question1
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declaring variables
      double balance=0;
      double deposit=0;
      double withdraw=0;
      double loanAmount=0;
      double interest=0;
      double totalInt=0;
      int months=0;
      int input=0;
      int depositCount=0;
      int withdrawCount=0;
      boolean menu=true;
      
      System.out.println("Welcome to LYIT Bank");
      System.out.println("1. View Balance");
      System.out.println("2. Make a deposit");
      System.out.println("3. Make a withdrawal");
      System.out.println("4. View Number of transactions made");
      System.out.println("5. See how much a loan would cost you");
      System.out.println("6. Exit");
      while(menu=true)
      {
      System.out.print("Choose an option: ");
      input=in.nextInt();
      if( input==1)
      {
         System.out.println("Your balance is "+balance);
      }
      
      else if( input==2)
      {
         System.out.print("How much do you want to deposit?: ");
         deposit = in.nextDouble();
         
         balance= balance + deposit;
      }
      
      else if(input==3)
      {
         System.out.print("How much do you want to withdraw?: ");
         withdraw=in.nextDouble();
         
         
         if(withdraw >= balance)
         {
            System.out.println("Insufficient funds - today you can withdraw up to "+balance);
         }
         else if(withdraw < balance)
         {
            balance=balance-withdraw;
         }
      }
      
      else if(input==4)
      {
         if(input==2)
         {
            depositCount++;
         }
         if(input==3)
         {
            withdrawCount++;
         }
         for(int i=0;i<100;i++)
         {
            System.out.print("You have made "+depositCount+ " deposit and "+withdrawCount+" withdraw on your account");
         }
      }
      
      else if(input==5)
      {
         System.out.print("Enter loan amount: ");
         loanAmount=in.nextDouble();
         
         System.out.print("Enter number of months to pay it back: ");
         months=in.nextInt();
         
         System.out.println("Loan amount: "+loanAmount);
         
         System.out.println("Total interest: "+loanAmount*.05);
         totalInt=loanAmount/months+loanAmount*.05/months;
         System.out.println("Loan Payment Schedule: ");
         System.out.println("Month Payment Balance ");
            for(int i=0;i<months;i++)
            {
               System.out.println((i+1)+"     "+(loanAmount/months+loanAmount*.05/months)+"     "+(loanAmount-totalInt));
               
            }
        
        }
         
         else if(input==6)
         {
            System.out.print("You have chosen Exit. Have a nice day!");
            System.exit(0);
            
         }
      
      }
   }
}