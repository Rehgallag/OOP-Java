// Practical 2A- Extra Practice Question
// John Gallagher
// 24 September 2019
// Program to display result on screen

import java.util.Scanner;

public class RoomPricing
{
   public static void main(String[] args)
   {
      //declare variables
      Scanner keyboardIn = new Scanner(System.in);
      double length, width, area, laminate, semiSolid, hardwood;
      
      //assign values to variables
      System.out.print("Enter the length of your room in metres: ");
      length = keyboardIn.nextDouble();
      
      System.out.print("Enter the width of your room in metres: ");
      width = keyboardIn.nextDouble();
      
      area = length * width;
      
      laminate = 9.5 * area;
      semiSolid = 21 * area;
      hardwood = 42 * area;
      
      //display results on screen
      System.out.print("The area of your room is " + area + " sqaure metres");
      System.out.println("\nThe cost of your floor would be: ");
      System.out.println("Laminate flooring: " + laminate);
      System.out.println("Semi-Solid flooring: " + semiSolid);
      System.out.println("Hardwood flooring: " + hardwood);
      

   }
}