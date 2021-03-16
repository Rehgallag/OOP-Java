// Practical 7A - Question 1
// John Gallagher
// 03 March 2020
// Program to display result on screen

import java.util.*;

public class Q1PairOfNumberOperations {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Pair p1 = new Pair();
      
      p1.setNum1(5);
      p1.setNum2(3);
      
      System.out.println("Number 1 is: " + p1.getNum1());
      System.out.println("Number 2 is: " + p1.getNum2());
      
      System.out.println("The sum is: " + p1.getSum());
      System.out.println("The difference is: " + p1.getDifference());
      System.out.println("The product is: " + p1.getProduct());
      System.out.println("The average is: " + p1.getAverage());
   }
}