// Practical 1A- Question 5
// John Gallagher
// 21 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q5IntegerReverseOrder{
   public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num1;
      System.out.print("Input integer: ");
      num1=in.nextInt();
      displayInteger(num1);
   }
   
   public static void displayInteger(int n1){
      int reverse = 0;
        for (int i = n1; i !=0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }
        System.out.print(reverse);
      
   }
}