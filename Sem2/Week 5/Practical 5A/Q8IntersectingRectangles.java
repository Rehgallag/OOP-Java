// Practical 5A - Question 8
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.*;

public class Q8IntersectingRectangles{
   public static void main(String[] args){
      Rectangle r1 = new Rectangle(0,0,10,20);
      Rectangle r2 = new Rectangle(5,10,5,15);
      
      System.out.println(r1);
      
      System.out.println(r2);
      
      System.out.println(r2.intersection(r1));
      System.out.println(r2.intersects(r1));
   }
}