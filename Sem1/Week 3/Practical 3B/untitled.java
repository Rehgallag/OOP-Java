// Practical 3B- Question 5
// John Gallagher
// 3 October 2019
// Program to display result on screen

import java.util.Scanner;

public class AreaTriRect
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner keyboardIn = new Scanner(System.in);
      double length = 0;
      double height = 0;
      double area1, area2;
      char choice;
      
      
      
      //prompt user input
      System.out.print("Please enter the length: ");
      length = keyboardIn.nextDouble();
      
      System.out.println("Please enter the height: ");
      height = keyboardIn.nextDouble();
      
      System.out.println("Please enter R or T");
      choice = keyboardIn.next().charAt(0);
      
      area1 = length * height;
      area2 = (length * .5) * height;
      
      
      if(choice == 'T')
      {
               System.out.print("The area is " + area2);
      }
      else if(choice == 'R')
      {
               System.out.print("The area is " + area1);
      }
   }  
}