// Practical 2B - Question 3
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q3ThreeBookPrices{
   public static void main(String[] args){
      Scanner in =  new Scanner(System.in);
      double item1, item2, item3, total;
      
      System.out.print("Enter the price of the first item: ");
      item1 = in.nextDouble();
      
      System.out.print("Enter the price of the second item: ");
      item2 = in.nextDouble();
      
      System.out.print("Enter the price of the third item: ");
      item3 = in.nextDouble();
      
      total = getTotalAmount(item1,item2,item3);
      System.out.println("The total amount owed is: " + total);
      
   }
   
   public static double getTotalAmount(double item1, double item2, double item3){
      double discount = 0.1;
      double finalPrice=0;
      double amount;
      amount = item1 + item2 + item3;
      if(amount > 50){
         finalPrice = (amount*discount)+amount;
         return finalPrice;
      }
      else{
         return amount;
      }
   }
}