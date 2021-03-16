// Practical 5B - Question 2 & 4(Modified Q)
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q2InputOblongValues{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Oblong myOblong = new Oblong();
      
      System.out.print("Enter the height: ");
      myOblong.setHeight(in.nextDouble());
      
      System.out.print("Enter the width: ");
      myOblong.setWidth(in.nextDouble());
      
      System.out.println("Area: " + myOblong.calculateArea());
      
      // Modified, added calculatePerimeter method in Oblong Class
      System.out.println("Perimeter: " + myOblong.calculatePerimeter());
   }
}