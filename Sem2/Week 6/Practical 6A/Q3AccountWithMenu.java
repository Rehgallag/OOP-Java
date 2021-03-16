// Practical 6A - Question 3
// John Gallagher
// 25 February 2020 
// Program to display result on screen

import java.util.*;

public class Q3AccountWithMenu {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BankAccount myAcc = new BankAccount();
      char quit = 'n';
      String input;
      int choice = 0;
      
      while(choice != 'y') {
           try {
            System.out.println("*****LyIT Bank****"
                     + "\n1. Deposit"
                     + "\n2. Withdraw"
                     + "\n3. Get balance"
                     + "\nPlease select an option: ");
         choice = in.nextInt();
         }
         catch(NumberFormatException e){
             System.out.println("Invalid selection. Please try again.");
         }
         switch(choice) {
            case 1:
                  System.out.print("Please enter how much you want to deposit: ");
                  myAcc.deposit(in.nextDouble());
                  break;
            case 2:
                  System.out.print("Please enter how much you want to withdraw: ");
                  myAcc.withdraw(in.nextDouble());
                  break;
            case 3:
                  System.out.println(myAcc.getBalance());
                  break;         
            default:
                  System.out.println("That wasn't a choice.");   
         }           
         System.out.print("Would you like to quit y/n? ");
         input = in.next().toLowerCase();
         quit = input.charAt(0);
        } 
   }
}