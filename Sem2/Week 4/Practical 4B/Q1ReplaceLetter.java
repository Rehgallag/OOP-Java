// Practical 4B - Question 1
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1ReplaceLetter{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = new String();
      String replace = new String();
      String letter = new String();
      
      System.out.print("Please enter a string of text: ");
      str = in.nextLine();
      
      System.out.print("Please enter letter to replace: ");
      replace = in.nextLine();
      
      System.out.print("Please enter replacement letter: ");
      letter = in.nextLine();
      
      String replacing = str.replace(replace, letter);
      
      System.out.println("The new string is " + replacing);
   }
}