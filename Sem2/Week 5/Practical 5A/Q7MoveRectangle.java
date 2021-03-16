// Practical 5A - Question 6
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.*;

public class Q7MoveRectangle{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Rectangle rect = new Rectangle();
      
      System.out.print("Please enter the height: ");
      int h = in.nextInt();
      
      System.out.print("Please enter the width: ");
      int w = in.nextInt();
      
      rect.setSize(h,w);
      rect.setLocation(50,-70);
      System.out.println(rect);
      

   }
}