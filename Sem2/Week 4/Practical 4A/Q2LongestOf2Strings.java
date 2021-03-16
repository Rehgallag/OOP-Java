// Practical 4A - Question 2
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q2LongestOf2Strings{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      String name1 = new String();
      String name2 = new String();
      
      System.out.print("Please enter the first String: ");
      name1 = in.nextLine();
      
      System.out.print("Please enter the second String: ");
      name2 = in.nextLine();
      
      int noOfChars = name1.length();
      int noOfChars2 = name2.length();
      
      if(noOfChars > noOfChars2){
         System.out.println(name1 + " is the longest String.");
      }
      else if(noOfChars2 > noOfChars){
         System.out.println(name2 + " is the longest String.");
      }
      else{
         System.out.println("The 2 Strings are of equal length.");
      }
      
   }
}