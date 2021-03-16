// Practical 4A - Question 1
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1HowManyCharsInName{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String name = new String();
      
      System.out.print("Please enter your name: ");
      name = in.nextLine();
      
      int noOfChars = name.length();
      
      System.out.println(name + " contains "+ noOfChars + " character(s).");
      
      
      
   }
}