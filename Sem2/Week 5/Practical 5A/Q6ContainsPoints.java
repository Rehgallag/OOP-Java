// Practical 5A - Question 5
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.*;

public class Q6ContainsPoints{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Rectangle box = new Rectangle(20,10);
      
      System.out.print("Please enter the x coordinate of the point you wish to test: ");
      int x = in.nextInt();
      
      System.out.print("Please enter the y coordinate of the point you wish to test: ");
      int y = in.nextInt();
      
      if(box.contains(x,y)){
         System.out.println("The rectangle does contain the point " + "("+x+","+y+")");
      }
      else{
          System.out.println("The rectangle does not contain the point " + "("+x+","+y+")");
      }
   }
}