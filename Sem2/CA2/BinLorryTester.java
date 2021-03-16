// CA2 - Question 2
// BinLorryTester
// John Gallagher
// Applied Computing

import java.util.*;

public class BinLorryTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      BinLorry b1 = new BinLorry();
      double amt;
      double distance;
      double bin;
      int option; 
      
      do{
         //display menu
         System.out.println("\nBinLorryTester\n1. Get Rubbish Level\n2. Calculate empty epace in rubbish tank " );
         System.out.println("3. Empty rubbish tank\n4. Refuel fuel tank\n5. Refuel fuel tank by certain amount of litres" );
         System.out.println("6. Drive a certain distance\n7. Collect bin" );
         System.out.println("0. Exit" );
         
         System.out.print("\nEnter your choice: " );
         option = in.nextInt();
         
         //check to see what option is - use a switch
         switch(option)
         {
            case 1: //Get Rubbish Level
               System.out.print("The current rubbish lvl is: " + b1.getRubbishLvl());
               System.out.println(b1);
               break;
            case 2: //Calculate empty epace in rubbish tank
               System.out.print("The empty space is: " + b1.getEmptySpace() + " litres");
               break;
            case 3: //Empty rubbish tank
               b1.empty();
               System.out.print("The rubbish tank has been emptied");         
               break;        
            case 4: //Refuel fuel tank 
               b1.fill();
               break;
            case 5: //Refuel fuel tank by certain amount of litres
               System.out.print("Enter the amount of litres: ");
               amt = in.nextDouble();
               b1.addFuel(amt);
               break;
            case 6:  //Drive a certain distance  
               System.out.print("Enter the distance to drive: ");
               distance = in.nextDouble();
               b1.drive(distance);                 
               break;
            case 7:  //Collect bin
               System.out.print("Enter the size of the bin");
               bin = in.nextDouble();
               System.out.println("Collecting Bin");
               b1.collectBin(bin);
               System.out.println("Bin has been collected");
               break;
            case 0:  //empty case
               break;
            default: System.out.print("INVALID ENTRY - enter a value from 0 to 7"); 
         
                   
         }
         
         
      }while(option != 0);
   }
}