// Practical 2A - Question 4
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q4IntegerParameter{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int number1;
      
      System.out.print("Enter number 1: ");
      number1 = in.nextInt();
      
      if(isOdd(number1)){
         System.out.println(number1 + " is an even number");
      }
      else{
         System.out.println(number1 + " is NOT an even number");
      }
   }
   
   public static boolean isOdd(int no1){
      if(no1 % 2 == 0){
         return true;
      }
      else{
         return false;
      }
   }
}