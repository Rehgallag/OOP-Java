// Practical 4B - Question 7
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q7DictionaryOrder{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the first String: ");
      String str1 = in.nextLine();
      
      System.out.print("Please enter the second String: ");
      String str2 = in.nextLine();
      
      
      
      if (str1.compareTo(str2)){
         System.out.println(""+str1+"" + " comes before " + ""+str2+"" + " in the dictionary");
      }
   
   }
}