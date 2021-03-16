// Practical 12A- Question 6
// John Gallagher
// 12 December 2019
// Program to display result on screen

import java.util.*;

public class PizzaMenuChoice{

   public static void main(String[] args){
   
      Scanner in=new Scanner(System.in);
      
      int counterM=0,counterV=0,counterH=0;
      int input=0;
      double total=0;
      boolean menu=true;
      
      System.out.println("Welcome to the Pizzeria!");
      System.out.println("Press a number to order [1-4]");
      System.out.println("1. Margherita E10 ");
      System.out.println("2. Hawaiian E12");
      System.out.println("3. Vegetarian E9.50");
      System.out.println("4. Exit ");
      
      System.out.print("Please enter your order: ");
      input=in.nextInt();
      while(menu=true){
      
      System.out.print("Please enter your order: ");
      input=in.nextInt();

      
         if(input==1){
            
            counterM++;
            total=total+10;
         }
         else if(input==2){
            
            counterH++;
            total=total+12;
         }
         else if(input==3){
            
            counterV++;
            total=total+9.50;
         }
         else if(input==4){
         
            System.out.println("You have ordered "+ counterM+ " Margherita, "+counterH+ " Hawaiian and "+counterV+ " Vegetarian pizza(s).");
            System.out.println("Your total is: "+total);
            System.exit(0);
         }
       }
   }
}