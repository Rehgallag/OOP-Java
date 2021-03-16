// Practical 2A- Question 6
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class Initials
{
   public static void main(String[] args)
   {
      //declare variables
      Scanner keyboardIn = new Scanner(System.in);
      char firstInitial, secondInitial;
      
      //assign values to variables
      System.out.print("Enter your first initial: ");
      firstInitial = keyboardIn.next().charAt(0);
      
      System.out.print("Enter your second initial: ");
      secondInitial = keyboardIn.next().charAt(0);
      
      //display initials on screen
      System.out.print("Your initials are "+firstInitial +" "+secondInitial);

   }
}