// Practical 4B - Question 2
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q2OpenSesame{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String password = "open Sesame";
      String input = new String();
      int counter=0;
      
      
      do{
      System.out.print("Please enter the password: ");
      input = in.nextLine();
      
      if(input != password){
         counter++;
      }
      
      if(input.equals("open Sesame")){
         System.out.println("Password is correct");
            break;
      }
      else{
         System.out.println("Password is incorrect");
         if(counter == 3){
            System.out.println("You are locked out. Try again later.");
            System.exit(0);
            
         }
      }
      }while(input != password);
      
   }  
}
