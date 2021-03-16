// Practical 5A- Question 5
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class Wire
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      char letter;
      
      System.out.print("Enter the value assigned to the wire: ");
      letter = in.next().charAt(0);
      
      switch(letter)
      {
         case 'E': case 'e':
               System.out.print("EARTH - GREEN");
               break;
         case 'N': case 'n':
               System.out.print("NEUTRAL - BLUE");
               break;
         case 'L': case 'l':
               System.out.print("LIVE - BROWN");
               break;
         default: System.out.print("INVALID ENTRY - ENTER E, N or L");
         break;
      
      }
   }
}