// Practical 5B - Question 7
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q7FindDiagonalOfOblong{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Oblong myOblong = new Oblong();
      
      System.out.print("Enter the height: ");
      myOblong.setHeight(in.nextDouble());
      
      System.out.print("Enter the width: ");
      myOblong.setWidth(in.nextDouble());
      
      System.out.println("The diagonal of the Oblong is: " + myOblong.getDiag());
   }
}