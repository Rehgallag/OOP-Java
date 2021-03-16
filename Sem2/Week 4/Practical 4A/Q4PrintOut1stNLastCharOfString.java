// Practical 4A - Question 4
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q4PrintOut1stNLastCharOfString{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = new String();
      
      System.out.print("Please enter the String: ");
      str = in.nextLine();
      
      System.out.println("First character = " + str.charAt(0));
      System.out.println("Last character = " + str.charAt(str.length() - 1));
   }
}