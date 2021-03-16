// Practical 2C - Question 1
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1HeightInchesPoundsKgBMI{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double height, weight;
      
      System.out.print("Enter height in inches: ");
      height = in.nextDouble();
      
      
      
      System.out.print("Enther weight in pounds: ");
      weight = in.nextDouble();
      
      height = convertHeight(height);
      weight = convertWeight(weight);
      
      
      System.out.println("Your height in metres is: " + height);
      System.out.println("Your weight in Kgs is: " + weight);
      
   }
   
   public static double convertHeight(double no1){
      return no1 * 0.0254;
   }
   
   public static double convertWeight(double no2){
      return no2 * 0.453;
   }
    

   

}