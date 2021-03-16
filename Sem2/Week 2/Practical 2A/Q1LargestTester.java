// Practical 2A - Question 1
// John Gallagher
// 28 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1LargestTester{

   public static void main(String[] args){
      Scanner in = new Scanner(System.in);//create scanner
      int largest;
      int first, second;
      System.out.print ("Type in first number ");//get input
      first = in.nextInt();
      System.out.print ("Type in second number ");
      second = in.nextInt();
      //method call - returned value assigned to largest
      largest = max(first, second);
      System.out.println("The number is " + largest);
   }//end main method

   //method returns the largest of the 2 numbers
   public static int max(int num1, int num2){  
     if (num1 > num2)
		{
        return num1;
		}
     else
		{ 
        return num2;
   	}
	}
}//end class

