// Practical 7A- Question 14
// John Gallagher
// 5 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Print_3_Lottery_Numbers_UsingWhile
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
				
		int numChoice = 1; //store 3 number choices
		int i = 1; //initiaize index counter 
		char decision = 'c';
		
		System.out.println("Please enter lotto number between 1 and 40");
		while (i <=3)// loop 3 times while i is less than 3
		{
			numChoice = in.nextInt(); // get user input and store the value in numChoice

			System.out.println(" Number " + i + " entered was " + numChoice);
			i++;
			
			if(i > 3)
          {   
          	   System.out.println ("Would you like to enter 3 new numbers?please enter y or n");  
	            decision = in.next().charAt(0);
	             
	            if (decision == 'y')
	            {
	                System.out.println("You have chosen to enter 3 new numbers");
	            }
	            else
	            {
	                System.out.println("No! You are happy with your numbers");
	            }  
	        }//closing braces of if(i>3)
      }//closing braces of while loop         
   }//closing braces of main
}//closing braces of class
