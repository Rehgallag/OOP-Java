// Practical 1A- Question 4
// John Gallagher
// 21 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q4printGrade{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      char grade;
      System.out.print("Input character: ");
      grade=in.next().charAt(0);
      printGrade(grade);
   }//end main method
   public static void printGrade(char g){
      if(g=='A'){
         System.out.println("Excellent Student");
      }
      else if(g=='B'){
         System.out.println("Good Student");
      }
      else if(g=='C'){
         System.out.println("OK Student");
      }
      else if(g=='D'){
         System.out.println("OK Student");
      }
      else{
         System.out.println("FAIL");
      }
   }
}