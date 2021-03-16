// Practical 7B- Question 7
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Enter_Correct_Pin_With_3_Chances_Using_While
{
   public static void main(String args[])
   {
      //create a Scanner
      Scanner in = new Scanner(System.in);
      int pin = 1234, count = 0;
      
      System.out.println("Hello");
      System.out.print("ENTER YOUR PIN: ");
      int entry = in.nextInt();
      
      while(count<3) {
            if (entry == pin) {
               System.out.println("Welcome!"); 
               break;   //break from the loop
            }
            else {
                System.out.println("Password is incorrect! Try again!");
            }
            count++;
      }

      if(count == 3) {
            System.out.println("SIM BLOCKED");
      }   
   }
}