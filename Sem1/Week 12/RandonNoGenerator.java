// Practical 12A- Question 1
// John Gallagher
// 10 December 2019
// Program to display result on screen

import java.util.*;

public class RandonNoGenerator
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      Random noGenerator = new Random();
      //declare variable to store random no btw 1 and 100
      int randomNumber, input, counter=0;
      randomNumber=noGenerator.nextInt(100)+1;
      boolean test=true;
      
      while(test=true)
      {
         System.out.print("Please enter your guess: ");
         input=in.nextInt();
         
         if(input < randomNumber)
         {
            System.out.println("Incorrect - higher..");
            
            counter++;
         }
         else if(input > randomNumber)
         {
            System.out.println("Incorrect - lower..");
           
            counter++;
         }
         else if(input == randomNumber)
         {
            System.out.println("Well done. You got it in "+counter+ " turns");
            System.exit(0);
         }
      }
      
      
   }
}
