// Practical 4A - Question 6
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q6PrintOutIntials{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      String first = new String();
      String second = new String();
      
      System.out.print("Please enter your first name: ");
      first = in.nextLine();
      
      System.out.print("Please enter your second name: ");
      second = in.nextLine();
      
      System.out.println("Your initials are " + first.charAt(0)+second.charAt(0));
   }
}