// Practical 4A - Question 5
// John Gallagher
// 11 February 2020 
// Program to display result on screen

import java.util.*;

public class Q5LetMeInPassword{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String password = "Let me in";
      String enter = new String();
      
      System.out.print("Please enter the password: ");
      enter = in.nextLine();
      
      if(enter.equals("Let me in")){
         System.out.println("Password is correct");
      }
      else{
         System.out.println("Password is incorrect");
      }
   }
}