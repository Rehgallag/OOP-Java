// Practical 6B - Question 1 
// John Gallagher
// 27 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1ConvertDAmount {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Converter c1 = new Converter();
      char quit = 'n';
      String input;
      int choice = 0;
      
      
       
      while(quit != 'y') {
         try {
            System.out.print("Enter today's rate: ");
            c1.setRate(in.nextDouble());
            
            System.out.print("Enter an amount you wish to convert: ");
            c1.setAmount(in.nextDouble());
            
            System.out.println("Please choose a function"
                     + "\n1. Convert to Sterling"
                     + "\n2. Convert to Euro");
            choice = in.nextInt();
         }
         catch(NumberFormatException e){
            System.out.println("Invalid selection. Please try again.");
         }
         switch(choice) {
            case 1:
               System.out.println(c1.convertToSterling(c1.getAmount()));
               break;
            case 2:
               System.out.println(c1.convertToEuro(c1.getAmount()));
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
