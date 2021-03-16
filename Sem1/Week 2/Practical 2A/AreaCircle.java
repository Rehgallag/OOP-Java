// Practical 2A- Question 3
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class AreaCircle
{
   public static void main(String [] args)
   {
      //declare variables
      Scanner keyboardIn = new Scanner(System.in);
      double radius, area;
      
      //assign values to variables
      System.out.print("Enter the radius: ");
      radius = keyboardIn.nextDouble();
      
      area = 3.141592 * radius * radius ;
      
      // display results on screen
      System.out.print("The area of the circle is " + area);



   }
}