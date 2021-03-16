// Practical 6A- Question 4
// John Gallagher
// 22 October 2019
// Program to display result on screen

import java.util.Scanner;

public class LoanRates
{
   public static void main(String[] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      int amount;
      char loan;
      
      
      
      System.out.print("Please enter the loan amount: ");
      amount = in.nextInt();
      
      System.out.print("Enter type of Loan a/c(A, K, M, P, Z): ");
      loan = in.next().charAt(0);
      
      
      switch(loan)
      {
         case 'A': // sharing cases
         case 'a': System.out.print("10% bonus " + "Interest Due is: " + amount * 0.1 + " Total amount of repayment is: " + (amount + amount * .1));
                  break; 
         case 'K':
         case 'k': System.out.print("5% bonus" + "Interest Due is: " + amount * 0.05 + " Total amount of repayment is: " + (amount + amount * .05));
                  break;
         case 'M':
         case 'm': System.out.print("4% bonus" + "Interest Due is: " + amount * 0.04 + " Total amount of repayment is: " + (amount + amount * .04));
                  break;
         case 'P':
         case 'p': System.out.print("5% bonus" + "Interest Due is: " + amount * 0.05 + " Total amount of repayment is: " + (amount + amount * .05));
                  break;
         case 'Z':
         case 'z': System.out.print("10% bonus" + "Interest Due is: " + amount * 0.1 + " Total amount of repayment is: " + (amount + amount * .1));
                  break;
         default: System.out.print("Invalid input");         
         //end switch


      }





   }
}
