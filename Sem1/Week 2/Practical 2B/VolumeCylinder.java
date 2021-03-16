// Practical 2B- Question 2
// John Gallagher
// 26 September 2019
// Program to display result on screen

import java.util.Scanner;

public class VolumeCylinder
{
   public static void main(String[ ] args)
   {
      // create a Scanner object
      Scanner keyboardIn = new Scanner(System.in);
      
      // declare variables
      double radius, height, volume;
      final double PI = 3.141592; //note use of constant
      
      //1.Read and Store radius and height
      System.out.print("Enter radius of cylinder: ");
      radius =  keyboardIn.nextDouble();
      
      System.out.print("Enter height of cylinder: ");
      height = keyboardIn.nextDouble();
      
      //2. Compute volume
      volume = PI * (radius * radius) * height;
   
      //3. Display volume
      System.out.print("Volume of cylinder is " + volume);
      
      // end main method
   }
}