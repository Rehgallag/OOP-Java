// Practical 1B- Question 3
// John Gallagher
// 23 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q3ItemPrice{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      double item, amount;
      
      System.out.print("Enter the cost of the item: ");
      item=in.nextDouble();
      
      System.out.print("Enter the amount tendered: ");
      amount=in.nextDouble();
      
      displayReceipt(item, amount); //call method
   } // end main method
   public static void displayReceipt(double item, double amount){
      double total,vat,change;
      vat=item*0.135;
      total=item+vat; 
      change=amount-total;
      
      System.out.println ("***************************");
      System.out.println("Price of item: " + item);
      System.out.println("VAT (13.5%): " + vat);
      System.out.println("Total Price: " + total);
      
      System.out.println ("***************************");
      
      System.out.println("Amount tendered: " + amount);
      System.out.println("Change: " + change);
     
      System.out.println ("***************************");

   } 
}

