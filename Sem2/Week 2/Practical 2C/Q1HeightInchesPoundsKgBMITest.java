// Practical 2C - Question 1
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1HeightInchesPoundsKgBMITest{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double w, h, BMI;
      System.out.print("Enter your weight in pounds: ");
      w = in.nextDouble();
      System.out.print("Enter your height in inches: ");
      h = in.nextDouble();
      BMI = calculateBMI(w,h);
      
      System.out.println("BMI categories: ");
      if (BMI < 16){
         System.out.print("Your BMI is " + BMI+ " and you are currently seriously underweight.");
      }
      else if(BMI > 16 && BMI < 18){
         System.out.print("Your BMI is " + BMI+ " and you are underweight.");
      }
      else if(BMI > 18 && BMI < 24){
         System.out.print("Your BMI is " + BMI+ " and you are normal weight.");
      }
      else if(BMI > 24 && BMI < 29){
         System.out.print("Your BMI is " + BMI+ " and you are currently overweight.");
      }
      else if(BMI > 29 && BMI < 35){
         System.out.print("Your BMI is " + BMI+ " and you are currently seriously overweight.");
      }
      else if(BMI > 35){
         System.out.print("Your BMI is " + BMI+ " and you are currently gravely overweight.");
      }
      
      
   }
   
   public static double calculateBMI(double weight, double height){
      double result;
      result = ((weight*0.453)/Math.pow((height*0.0254),2.0));
      return result;
   }
}