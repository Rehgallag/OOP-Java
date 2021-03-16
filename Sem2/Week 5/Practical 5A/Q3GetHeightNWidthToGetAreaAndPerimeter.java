// Practical 5A - Question 3
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.Rectangle;

public class Q3GetHeightNWidthToGetAreaAndPerimeter{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the height: ");
      double h = in.nextDouble();
      
      System.out.print("Please enter the width: ");
      double w = in.nextDouble();
      
      System.out.println("The area of the rectangle is: " + h*w);
      System.out.println("The perimeter of the rectangle is: " + ((h*2)+(w*2)));
   }
}
