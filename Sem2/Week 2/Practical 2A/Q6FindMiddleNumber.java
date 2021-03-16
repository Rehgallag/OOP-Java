// Practical 2A - Question 6
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q6FindMiddleNumber{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int number1, number2, number3, middle;
      
      System.out.print("Please enter number 1: ");
      number1 = in.nextInt();
      
      System.out.print("Please enter number 2: ");
      number2 = in.nextInt();
      
      System.out.print("Please enter number 2: ");
      number3 = in.nextInt();
      
      middle = getMiddle(number1, number2, number3);
      System.out.println("The middle number is: " + middle);
   }
   
   public static int getMiddle(int number1, int number2, int number3){
      //checking num1 is a middle number or not
      if(number2>number1 && number1>number3 || number3>number1 && number1>number2){
         return number1;
      }
      //checking num2 is a middle number or not
      if(number1>number2 && number2>number3 || number3>number2 && number2>number1){
        return number2;
      }
      //checking num3 is a middle number or not
      if(number1>number3 && number3>number2 || number2>number3 && number3>number1){
         return number3;
      }
      
   }
   
}
