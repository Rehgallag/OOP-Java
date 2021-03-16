// Practical 4B - Question 5
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q5OneStrContainAnother{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      
      System.out.print("Please enter the first String: ");
      String str1 = in.nextLine();
      
      System.out.print("Please enter the second String: ");
      CharSequence str2 = in.nextLine();
      
      
      
      if (str1.contains(str2)){
         System.out.println(""+str1+"" + " contains the text " + ""+str2+"");
      }else{
         System.out.println(""+str1+"" + " does not contain the text " + ""+str2+"");
      }
      
      
      
   }
}