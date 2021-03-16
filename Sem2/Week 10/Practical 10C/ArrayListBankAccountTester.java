/*
	Written by : Maeve Carr
	Date:
	Desc:
*/
import java.util.*; 
public class ArrayListBankAccountTester
{
   public static void main(String [] args)
   {  
      Scanner in = new Scanner(System.in);
      //create an empty arraylist of bankaccount objects		
      ArrayList <BankAccount> accounts  = new ArrayList <BankAccount>();
      int accNum;
      double amount;
      int option; 
      
      do{
         //display menu
         System.out.println("\n\nBank Menu\n1. Open an account\n2. Close an account " );
         System.out.println("3. View All\n4. View one\n5. Deposit" );
         System.out.println("6. Withdraw" );
         System.out.println("0. Exit" );
         
         System.out.print("\nEnter your choice: " );
         option = in.nextInt();
         
         //check to see what option is - use a switch
         switch(option)
         {
            case 1: //Open an account
               accounts.add(new BankAccount());
               break;
            case 2: //Close Account 
               if(accounts.isEmpty())
               {
                  System.out.println("You need to add some accounts");
               }
               else
               {
                  //search for the account
                  System.out.print("Enter the acccount number: ");
                  accNum = in.nextInt();
                  for(int i=0; i<accounts.size(); i++)
                  {
                     BankAccount b = accounts.get(i);
                     if(accNum == b.getAccNumber())
                     {
                        accounts.remove(b);
                     } 
                  }
               }
               break;
            case 3: //View All Accounts           
               for(BankAccount b: accounts)
               {
                  System.out.println(b);
               } 
               break;        
            case 4: //View One Account   
               if(accounts.isEmpty())
               {
                  System.out.println("You need to add some accounts");
               }
               else
               {
                //search for the account
                  System.out.print("Enter an Account Number: ");
                  accNum = in.nextInt();
                  for(BankAccount b: accounts)
                  {
                     if(accNum == b.getAccNumber())
                     {
                        System.out.println(b);
                     }
                  }
               }
               break;
            case 5: //Deposit
               if(accounts.isEmpty())
               {
                  System.out.println("You need to add some accounts");
               }
               else
               {
                //search for the account
                  System.out.print("Enter an Account Number: ");
                  accNum = in.nextInt();
                  for(BankAccount b: accounts)
                  {
                     if(accNum == b.getAccNumber())
                     {
                        System.out.print("How much do you want to deposit?");
                        amount = in.nextDouble();
                        b.deposit(amount);
                     }
                  }
               }
               break;
            case 6:  //Withdraw
                if(accounts.isEmpty())
               {
                  System.out.println("You need to add some accounts");
               }
               else
               {
                //search for the account
                  System.out.print("Enter an Account Number: ");
                  accNum = in.nextInt();
                  for(BankAccount b: accounts)
                  {
                     if(accNum == b.getAccNumber())
                     {
                        System.out.print("How much do you want to withdraw?");
                        amount = in.nextDouble();
                        b.withdraw(amount);
                     }
                  }
               }
                       
               break;
            case 0:  //empty case
               break;
                                   
            default: System.out.print("INVALID ENTRY - enter a value from 0 to 6"); 
         
                   
         }
         
         
      }while(option != 0);   
   
   }
}
