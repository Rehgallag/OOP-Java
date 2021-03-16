// Practical 4A - Question 7
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q7SingleStringNameFindLettersNInitials{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      String name = new String();
      
      
      System.out.print("Please enter your full name: ");
      name = in.nextLine();
      
      String[] splitName = name.split("\\s+");
      
      int noOfChars = splitName[0].length();
      System.out.println("Your first name has " + noOfChars + " letter(s).");
      
      
      
      System.out.println("Your intials are " + splitName[0].charAt(0)+splitName[1].charAt(0));

   }
}