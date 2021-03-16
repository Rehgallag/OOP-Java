// Practical 5A - Question 10
// John Gallagher
// 18 February 2020 
// Program to display result on screen

import java.util.*;
import java.awt.*;

public class Q10SubStringFirstMiddleLast{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = new String();
      
      System.out.print("Please enter your full name: ");
      str = in.nextLine();
      
      System.out.println("Your first name is: " + str.substring(0,4));
      System.out.println("Your middle name is: " + str.substring(5,12));
      System.out.println("Your last name is: " + str.substring(12,21));
   }
}