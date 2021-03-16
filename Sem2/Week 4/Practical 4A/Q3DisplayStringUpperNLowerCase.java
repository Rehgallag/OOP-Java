// Practical 4A - Question 3
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q3DisplayStringUpperNLowerCase{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = new String();
      
      System.out.print("Please enter a String: ");
      str = in.nextLine();
      
      String upperCase = str.toUpperCase();
      String lowerCase = str.toLowerCase();
      
      System.out.println("Upper Case: " + upperCase);
      System.out.println("Lower Case: " + lowerCase);
   }
}