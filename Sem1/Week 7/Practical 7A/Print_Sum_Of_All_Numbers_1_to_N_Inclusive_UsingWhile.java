// Practical 7A- Question 12
// John Gallagher
// 5 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Print_Sum_Of_All_Numbers_1_to_N_Inclusive_UsingWhile
{
	public static void main(String args[] )
	{
      //loop counter initialisation
		int i=0, sum=0, n=0;
      
      //declare scanner
      Scanner in = new Scanner(System.in);
      
		//print statement
		System.out.print("Enter the n amount you want: ");
      n = in.nextInt();
      
      
		//loop to print sum of 1 to 10
		while(i<n)	
		{
         sum+=i;
         i++;
      }
      
      System.out.println("The sum is = "+sum);
    }
}