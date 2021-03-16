// Practical 2B - Question 1
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1ThreeTemperaturesRedo{
   public static void main(String[] args){
           
      
      displayTemp("FREEZING", "COLD", "MODERATE", "WARM");
   }
   
   public static String displayTemp(String temp1, String temp2, String temp3, String temp4){
      Scanner in = new Scanner(System.in);
      double num1, num2, num3, avg;
      
      System.out.print("Enter the first temperature: ");
      num1 = in.nextDouble();
      
      System.out.print("Enter the second temperature: ");
      num2 = in.nextDouble();
      
      System.out.print("Enter the third temperature: ");
      num3 = in.nextDouble();
      
      avg = (num1 + num2 + num3)/3;
      
      if(avg < 0){
         return temp1;
      }
      else{
         return temp2;
      }

   } 
}