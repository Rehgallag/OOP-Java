// Practical 2B - Question 1
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1ThreeTemperatures{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double firstTemp, secondTemp, thirdTemp;
      
      String result;
      
      System.out.print("Enter the first temperature: ");
      firstTemp = in.nextDouble();
      
      System.out.print("Enter the second temperature: ");
      secondTemp = in.nextDouble();
      
      System.out.print("Enter the third temperature: ");
      thirdTemp = in.nextDouble();
      
      result = getTempResult(firstTemp, secondTemp, thirdTemp);
      System.out.println("The average temp is " + result);
   }
   
   public static String getTempResult(double n1, double n2, double n3){
      double avg = (n1 + n2 + n3)/3;
      
      if(avg < 0){
         return "FREEZING";
      }
      else if(avg > 1 && avg < 9){
         return "COLD";
      }
      else if(avg > 9 && avg < 16){
         return "MODERATE";
      }
      else if(avg > 16){
         return "WARM";
      }
      else{
         return "Error";
      }
      
   } 
}