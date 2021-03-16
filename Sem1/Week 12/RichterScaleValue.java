// Practical 12A- Question 3
// John Gallagher
// 10 December 2019
// Program to display result on screen

import java.util.*;

public class RichterScaleValue
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      
      double rsValue;
      
      //prompt user input
      System.out.print("Enter the Richter scale value: ");
      rsValue = keyboardIn.nextDouble();
      
         if ( rsValue < 4 )
         { 
                  System.out.print("Value: " + rsValue + "Effect: Little");
         }
         else if ( rsValue >= 4.0 && rsValue <= 4.9 )
         {
                  System.out.print("Value: " + rsValue + " Effect: Windows shake");
         }
         else if ( rsValue >= 5.0 && rsValue <= 5.9 )
         {
                  System.out.print("Value: " + rsValue + " Effect: Walls crack; poorly build buildings are detroyed");
         }
         else if ( rsValue >= 6.0 && rsValue <= 6.9 )
         {
                  System.out.print("Value: " + rsValue + " Effect: Chimneys tumble, some buildings are destroyed");
         }
         else if ( rsValue >= 7.0 && rsValue <= 7.9 )
         { 
                  System.out.print("Value: " + rsValue + " Effect: Well-built buildings are damaged"); 
         }
         else if ( rsValue >= 7.9 )
         {
                  System.out.print("Value: " + rsValue + " Effect: Most buidlings are destroyed");
         }
   }
}
