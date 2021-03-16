// Practical 2A - Question 2
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q2ReturnSmallest{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num1, num2, smallest;
      
      System.out.print("Please enter the first number: ");
      num1 = in.nextInt();
      
      System.out.print("Please enter the second number: ");
      num2 = in.nextInt();
      //method call - returned value assigned to smalles
      smallest = getSmallest(num1, num2);
      System.out.println("The smallest number is: " + smallest);
   }//end main method
   
   public static int getSmallest(int num1, int num2){
      if(num1 < num2){
         return num1;
      }
      else{
         return num2;
      }
   }
}