// Practical 5A - Question 1 & 2
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.Rectangle;

public class Q1CreateNewRectangle{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Rectangle r1 = new Rectangle();
      
      System.out.print("Please enter the x coordinate: ");
      double x = in.nextDouble();
      
      System.out.print("Please enter the y coordinate: ");
      double y = in.nextDouble();

      System.out.print("Please enter the height: ");
      double h = in.nextDouble();
      
      System.out.print("Please enter the width: ");
      double w = in.nextDouble();
      
      System.out.println("The x coordinate is: " + x);
      System.out.println("The y coordinate is: " + y);
      System.out.println("The height is: " + h);
      System.out.println("The widht is: " + w);
   }
}
