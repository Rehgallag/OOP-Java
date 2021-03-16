// Practical 5B - Question 1 
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1OblongTester{
   public static void main(String[] args){
      Oblong myOblong = new Oblong();
      
      myOblong.setHeight(10);
      myOblong.setWidth(25);
      
      System.out.println("Width: " + myOblong.getHeight());
      System.out.println("Height: " + myOblong.getWidth());
      System.out.println("Area: " + myOblong.calculateArea());
   }
}