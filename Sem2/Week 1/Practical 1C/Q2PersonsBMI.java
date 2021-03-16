// Practical 1C- Question 2
// John Gallagher
// 24 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q2PersonsBMI {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      double weight, height;
      System.out.println("Enter your weight in kilograms: ");
      weight = in.nextDouble();
      System.out.println("Enter your height in meters: ");
      height = in.nextDouble();
      calculateBMI(weight,height);
   }  
   
   public static void calculateBMI(double w, double h){
      double BMI = w/(h*h);
      System.out.println("Your BMI is: " + BMI);
   }
}