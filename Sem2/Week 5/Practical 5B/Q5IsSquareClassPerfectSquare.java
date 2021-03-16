// Practical 5B - Question 5
// John Gallagher
// 20 February 2020 
// Program to display result on screen

import java.util.*;

public class Q5IsSquareClassPerfectSquare{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Oblong myOblong = new Oblong();
      
      System.out.print("Enter the height: ");
      myOblong.setHeight(in.nextDouble());
      
      System.out.print("Enter the width: ");
      myOblong.setWidth(in.nextDouble());
      
      if(myOblong.isSquare()==true){
         System.out.println("The Oblong is a square.");
      }  
      else{
         System.out.println("The Oblong is not a square.");
      } 
   }
}