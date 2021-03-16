// Practical 5A - Question 9
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.*;

public class Q9IntersectsPointRectangle{
   public static void main(String[] args){
      Rectangle r1 = new Rectangle(0,0,10,20);
      Rectangle r2 = new Rectangle(4,6,8,10);
      
      System.out.println(r1);
      
      System.out.println(r2);
      
      System.out.println(r2.intersects(r1));
      
      Rectangle r3 = new Rectangle();
      System.out.println(r2.intersection(r1));
   }
}