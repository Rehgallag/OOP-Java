// Practical 12A- Question 2
// John Gallagher
// 10 December 2019
// Program to display result on screen

import java.util.*;

public class DiceGameTest
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      Random noGenerator = new Random();
      //declare variable to store random no btw 1 and 100
      int input, counter=0, sum=0,firstRoll,secondRoll;
      boolean test=true;
      System.out.print("Enter 1 to roll the dice or Enter 2 to exit: ");
      input=in.nextInt();
            
      while(test=true)
      {
         if(input==1)
         {
            do {
               firstRoll = 1 + (int) (Math.random() * 6);
               secondRoll = 1 + (int) (Math.random() * 6);
               System.out.println("Roll #1: " + firstRoll);
               System.out.println("Roll #2: " + secondRoll);
               sum = firstRoll + secondRoll;
               System.out.println("The total is " + sum);
               } while (input!=2);         }
          else  if(input == 2)
          {
             System.out.println("Thank you for playing.");
             System.exit(0);
           }
      }  
      
      
   }
}
