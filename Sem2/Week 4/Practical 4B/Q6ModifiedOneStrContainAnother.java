// Practical 4B - Question 6
// John Gallagher
// 13 February 2020 
// Program to display result on screen

import java.util.*;

public class Q6ModifiedOneStrContainAnother{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      
      System.out.print("Please enter the first String: ");
      String str1 = in.nextLine();
      
      System.out.print("Please enter the second String: ");
      String str2 = in.nextLine();
      
      
      
      if (str1.startsWith(str2)){
         System.out.println(""+str1+"" + " contains the text " + ""+str2+"");
         System.out.println(""+str2+"" + " starts with the text " + ""+str1+"");
      }
      if (str1.endsWith(str2)){
         System.out.println(""+str1+"" + " contains the text " + ""+str2+"");
         System.out.println(""+str1+"" + " ends with the text " + ""+str2+"");
      }
      
      
      
   }
}