// Practical 2A - Question 5
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q5CompoundInterest{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double pr, rate, t, com;
      
      System.out.print("Enter the amount: ");
      pr = in.nextDouble();
      
      System.out.print("Enter the No.of years: ");
      t = in.nextDouble();
      
      System.out.print("Enter the Rate of  interest: ");
      rate = in.nextDouble();
      
      com=pr * (1.0+rate/100.0*t) - pr;
      
      calcCompoundInterest(pr, t, rate, com);
      System.out. println("Compound Interest="+com);
   }
   
   public static double calcCompoundInterest(double pr, double t, double rate, double com){
      return com;
   }
   
}
