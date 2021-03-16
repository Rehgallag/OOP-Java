// Practical 7B- Question 6
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Enter_Correct_Pin_Using_While
{
   public static void main(String args[])
   {
      //create a Scanner
      Scanner in = new Scanner(System.in);
      int pin = 1234;
      
      System.out.println("Hello");
      System.out.print("ENTER YOUR PIN: ");
      int entry = in.nextInt();
      
      while(entry != pin)
      {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			   System.out.print("ENTER YOUR PIN: ");
			   entry = in.nextInt();
      }
      
      System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR PHONE.");
   }
}