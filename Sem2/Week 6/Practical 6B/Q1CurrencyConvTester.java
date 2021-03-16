// Practical 6B - Question 1 
// John Gallagher
// 27 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1CurrencyConvTester {
   public static void main(String[] args) {
      Converter newConv = new Converter();
      newConv.setRate(0.77);
      newConv.setAmount(5);
      
      System.out.println(newConv.convertToSterling(newConv.getAmount()));
      System.out.println(newConv.convertToEuro(newConv.getAmount()));
   }
}