// Demo program
// John Gallagher
// 23 September 2019

import java.util.Scanner;

public class DemoCharacter
{
  public static void main(String[ ] args)
   {
      // declare variables
      Scanner keyboardIn = new Scanner(System.in);
      char firstInitial;
      char secondInitial;
   
   
      //read initials from keyboard
      System.out.print("Enter your first initial ");
      firstInitial = keyboardIn.next().charAt(0);
      
      System.out.print("Enter your seocnd initial ");
      secondInitial = keyboardIn.next().charAt(0);
      
      //display initials
      System.out.print("Your initials are " + firstInitial + secondInitial);     
  
  
  }
 } 