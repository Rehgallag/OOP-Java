// Question 1
// CA 
// John Gallagher
// 21 February 2020
// Program to display result on screen

import java.util.*;

public class Assign1Q1
{
   public static void main(String [] args)
   {
   
      Scanner keyIn = new Scanner(System.in);
      int numPeople;
      double ticketPrice = 0;
      double popcornPrice = 0;
      double totalPrice = 0;
      double receipt = 0;
      // get number of people in the party
      System.out.print("How many people are in your party? ");
      numPeople = keyIn.nextInt();
      
      
      ticketPrice = calculateTicketPrice(numPeople);
      
       
      popcornPrice = calculatePopcornPrice(numPeople);
      
      
       
      totalPrice = calculateTotalPrice(ticketPrice, popcornPrice);
      
       
      receipt = printReceipt(ticketPrice, popcornPrice, totalPrice);
      System.out.println("Ticket Price: " + ticketPrice);
      System.out.println("Popcorn Price: " + popcornPrice);
      System.out.println("Total Price (including discounts): " +receipt);
       
       
      printSeats(numPeople);
      System.out.println("Seat numbers " + printSeats(numPeople) + " to " + printSeats(numPeople));
   }

  
   // method to calculate and return the ticket price
   // tickets cost 5.50 per person
   // WRITE YOUR METHOD HERE
   public static double calculateTicketPrice(int ppl) {
      double price = 5.5;
      double n = ppl;
      return ((price * 1)*(n));
   }
   
   
   
      
   // method to calculate and return the cost of popcorn
   // the method should ask each person if they want popcorn (y or n)
   // if they do, add 3.75 to the cost of popcorn
   // WRITE YOUR METHOD HERE
   public static double calculatePopcornPrice(int ppl) {
      Scanner in = new Scanner(System.in);
      int n = ppl;
      double price = 3.75;
      String choice = new String();
      int counter;
      for(int i=0; i < n; i++) {
         System.out.print("Person number " + (i+1) + " Popcorn [Y or N]? ");
         choice = in.next().toLowerCase(); 
      }
      if(choice == "Y" || choice == "y") 
         counter = counter + 1;
      return ((3.75 * 1)*(counter));
      
   }
     
   
   // method to calculate and return the total price of tickets + popcorn
   // if the total is over 20.00, give a 2.50 discount.
   // WRITE YOUR METHOD HERE
   public static double calculateTotalPrice(double ticket, double pop) {
      double total = ticket + pop;
      if(total > 20) {
         return (total - 2.5);
      }
      else
         return total;
      
   }
 
   
   
   // method to print out details of ticket price, popcorn price
   // and total price.  Total price should be rounded down to the
   // nearest euro using an appropriate method from the Math class
   // WRITE YOUR METHOD HERE   
   public static double printReceipt(double ticketPrice, double popcornPrice, double totalPrice) {
      return Math.round(totalPrice);
   }
      
  

   
   // method to print seat numbers by generating a random number 
   // from 1 to 300 and printing a message e.g.  
   // Seat Numbers 24 to 28 (depending on number of people)
   // use a Math class method to generate the random number
   // WRITE YOUR METHOD HERE 
   public static int printSeats(int ppl) {
      int num = (int)(Math.random() * 300) + 1;
      return num;
      
   }
   
     
}