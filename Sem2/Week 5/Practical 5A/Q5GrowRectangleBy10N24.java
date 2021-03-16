// Practical 5A - Question 5
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.Rectangle;

public class Q5GrowRectangleBy10N24{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
       System.out.print("Please enter the height: ");
      int h = in.nextInt();
      
      System.out.print("Please enter the width: ");
      int w = in.nextInt();
      
      Rectangle r1 = new Rectangle();
      
      
      r1.grow(5,12);
      System.out.println(r1.getHeight());
      System.out.println(r1.getWidth());
      
      
  }
}