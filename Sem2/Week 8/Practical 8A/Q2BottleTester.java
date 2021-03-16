// Practical 8A - Question 2
// John Gallagher
// 10 March 2020 
// Program to display result on screen

import java.util.*;

public class Q2BottleTester {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Bottle b1 = new Bottle();
      int choice = 0;
         
         while(choice != 7) {
           try {
            System.out.println("Bottle Menu:"
                     + "   \n1. Fill bottle completely"
                     + "   \n2. Fill bottle by certain amount"
                     + "   \n3. Check amount of water in bottle"
                     + "   \n4. Check amount of water needed to fill bottle"
                     + "   \n5. Empty bottle"
                     + "   \n6. Pour an amount from bottle"
                     + "   \n7. Quit"
                     + "\nPlease select your option: ");
         choice = in.nextInt();
         }
         catch(NumberFormatException e){
             System.out.println("Invalid selection. Please try again.");
         }
         switch(choice) {
            case 1:
                  b1.fill();
                  System.out.print("\n");
                  break;
            case 2:
                  System.out.print("Enter the amount you want to fill by: ");
                  double amount = in.nextDouble();
                  b1.fill(amount);
                  System.out.print("\n");
                  break;
            case 3:
                  b1.getLiquidLevel();
                  System.out.println("The amount of water in the bottle is: " + b1.getLiquidLevel() + " litres.");
                  System.out.print("\n");
                  break;
            case 4:
                  b1.getEmptySpace();
                  System.out.println("You need " + b1.getEmptySpace() + " litres to fill the bottle");
                  System.out.print("\n");
                  break;
            case 5:
                  b1.empty();
                  System.out.print("\n");
                  break;
            case 6:
                  System.out.print("Enter the amount you want to pour out: ");
                  amount = in.nextDouble();
                  b1.pour(amount);
                  System.out.print("\n");
                  break;
            case 7:
                  System.out.println("Thank you for using Bottle Tester.");
                  System.exit(0);
                  System.out.print("\n");
                  break;
            default:
                  System.out.println("That wasn't a choice."); 
            }  
         }
   }
}