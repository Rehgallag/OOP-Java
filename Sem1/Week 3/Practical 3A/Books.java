// Practical 3A- Question 4
// John Gallagher
// 1 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Books
{
   public static void main(String [ ] args)
   {
      //create a scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      double book1, book2, book3 = 0;
      double total, discount, newTotal, noTotal; 
      
      //prompt user to input
      System.out.println("Please enter the price of the 1st book: ");
      //read and store keyboard input
      book1 = keyboardIn.nextDouble();
     
      System.out.println("Please enter the price of the 2nd book: ");
      //read and store keyboard input
      book2 = keyboardIn.nextDouble();
      
      System.out.println("Please enter the price of the 3rd book: ");
      //read and store keyboard input
      book3 = keyboardIn.nextDouble();
      
      //assign values to variables
      total = book1 + book2 + book3;
      discount = total * .1;
      newTotal = total - discount;
     
      
      
      if(total > 50.00)
      {
               //display message
               System.out.println("Your total is " + total);
               System.out.println("10% discount being applied");
               System.out.println("Your new total is " + newTotal);
               
      }
   
      if(total < 50.00)
      {
               System.out.print("No discount applied");
               System.out.println("Your total is " + total);
      }
   }
}