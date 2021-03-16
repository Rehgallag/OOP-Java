/* 
  Practical 20 - Question 1
  Eleanor Birrell
  5 December 2019
  Program to display month
*/

import java.util.Scanner;
public class Months
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int number = 0;
      
      String [] months = new String [] {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
      int [] days = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      do{
      System.out.print("Enter month number [1 to 12]: [enter -1 to stop]: ");
      number = keyboardIn.nextInt();
      
      switch (number)
      {
         case 4 : case 6 : case 9 : case 11 :              
            System.out.println("This month is "+months[(number - 1)]);
            System.out.println(months[(number - 1)] +" has  " +days[number - 1] +" days");
            break;
         
            
          case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :          
            System.out.println("This month is "+months[(number - 1)]);
            System.out.println(months[(number - 1)] +" has  " +days[number - 1] +" days");
            break;
           
            
          case 2 :          
            System.out.println("This month is "+months[(number - 1)]);
            System.out.println(months[(number - 1)] +" has  " +days[number - 1] +" days");
            break;
           
         case -1 :
            System.out.println("Goodbye.");
            break;
         
           default :
           System.out.println("Invalid number");
           break;
        }
           
        } while(number != -1);
                
   }
}