// Practical 4B - Question 4
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q4Concat2Strings{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str1 = new String();
      String str2 = new String();
      
      System.out.print("Please enter a String: ");
      str1 = in.nextLine();
      
      System.out.print("Please enter another String: ");
      str2 = in.nextLine();
      
      System.out.println(str1.concat(str2));
   }
}