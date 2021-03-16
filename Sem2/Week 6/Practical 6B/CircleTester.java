// Practical 6B - Question 2
// John Gallagher
// 27 February 2020 
// Program to display result on screen

import java.util.*;

public class CircleTester {
   public static void main(String[] args) {
      CircleCalc c1 = new CircleCalc();
      
      c1.setRadius(5);
      
      System.out.println(c1.getArea());
      
      System.out.println(c1.getCircumference());
   }
}