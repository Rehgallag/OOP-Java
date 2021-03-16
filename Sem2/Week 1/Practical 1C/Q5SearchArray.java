// Practical 1C- Question 5
// John Gallagher
// 24 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q5SearchArray{
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
       //declare variables
       int value;
       //get user input
       System.out.print("Please enter a value: ");
       value =in.nextInt();
       int [] theArray = new int [] {8, 12, 18, 22, 29, 34};
       searchArray(value, theArray);
   }//end of main method
   
   public static void searchArray(int value, int [] theArray)
   {
      
      for(int i = 0; i<theArray.length; i++){
         if(value == theArray[i]){
         System.out.println("Value found at position: " + i);
         }
      }

   } 
}//end of class