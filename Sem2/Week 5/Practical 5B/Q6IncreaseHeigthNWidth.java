// Practical 5B - Question 6
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q6IncreaseHeigthNWidth{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Oblong myOblong = new Oblong();
      
      System.out.print("Enter the height: ");
      myOblong.setHeight(in.nextDouble());
      
      System.out.print("Enter the width: ");
      myOblong.setWidth(in.nextDouble());
      
      System.out.print("Enter the amount you want to increase the Height: ");
      double change1 = in.nextDouble();
      
      System.out.print("Enter the amount you want to increase the width: ");
      double change2 = in.nextDouble();
      myOblong.growOb(change1,change2);
      
      System.out.println("The new Height is: " + myOblong.getHeight());
      System.out.println("The new Width is: " + myOblong.getWidth());
   }
}