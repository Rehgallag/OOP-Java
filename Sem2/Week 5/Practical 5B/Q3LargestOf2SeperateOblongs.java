// Practical 5B - Question 3
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q3LargestOf2SeperateOblongs{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Oblong ob1 = new Oblong();
      
      System.out.print("Enter the height of the first oblong: ");
      ob1.setHeight(in.nextDouble());
      
      System.out.print("Enter the width of the first oblong: ");
      ob1.setWidth(in.nextDouble());
      
      ob1.calculateArea();
      
      Oblong ob2 = new Oblong();
      
      System.out.println("");
      
      System.out.print("Enter the height of the second oblong: ");
      ob2.setHeight(in.nextDouble());
      
      System.out.print("Enter the width of the second oblong: ");
      ob2.setWidth(in.nextDouble());
      
      ob2.calculateArea();
      
      System.out.println("");
      
      if(ob1.calculateArea() > ob2.calculateArea()){
         System.out.println("The largest area is the Oblong with:");
         System.out.println("Width: " + ob1.getWidth() + " " + "Height: " + ob1.getHeight());
      }
      else if(ob2.calculateArea() > ob1.calculateArea()){
         System.out.println("The largest area is the Oblong with:");
         System.out.println("Width: " + ob2.getWidth() + " " + "Height: " + ob2.getHeight());
      }
      else{
         System.out.println("Both Oblongs have the same area");
      }
   }
}