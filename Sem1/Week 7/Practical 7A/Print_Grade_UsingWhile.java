// Practical 7A- Question 13
// John Gallagher
// 5 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Print_Grade_UsingWhile
{
	public static void main(String args[] )
	{
		//declare scanner
      Scanner in = new Scanner(System.in);
      
      //loop counter initialisation
		int i=0;
      
      System.out.print("Please enter result: ");
       i= in.nextInt();
         
		//loop to print the statement
		while(i < 0 || i > 100)	
		{
		   System.out.println("Invalid Entry");
         System.out.println("Please enter valid result: ");
         i= in.nextInt();
			
		}
           System.out.println("Result is " + i);
	}
}
          