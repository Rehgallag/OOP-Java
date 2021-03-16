// Practical 9A- Question 2
// John Gallagher
// 19 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Printing_User_Input_Stars_Using_Nested_Loops {

   public static void main(String[] args) {
   
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      int n,sum=0;
      
      do{
      System.out.print("How many stars do you wish to see? ");
      n=in.nextInt();
      
      for(int i=1; i<=n; i++)
      {
         System.out.print("*");
      }
       System.out.println();
      } while (n!=0);    
   }
}
