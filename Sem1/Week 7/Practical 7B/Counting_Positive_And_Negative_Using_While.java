// Practical 7B- Question 4
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Counting_Positive_And_Negative_Using_While
{
   public static void main(String args[])
   {
      //display instruction
      System.out.println("Enter an int value: ");

      //create a scanner
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int positive = 0;
      int negative = 0;
      int total = 0; // number of numbers entered
      double sum = 0.0; // sum of all integers
      
      // while the number is not 0
      while (num != 0) {
            // count the positive
            if( num > 0)
                  positive++;
            // count the negative
            else
                  negative++;
            // count the total
            total++;
            sum += num;
            
            num = in.nextInt();
       }
       
       System.out.println("The number of positives is " + positive);
		 System.out.println("The nubmer of negatives is " + negative);
		 System.out.println("The total is " + total);
   }
}