// Practical 7A- Question 11
// John Gallagher
// 5 November 2019
// Program to display result on screen

public class Print_Sum_Of_All_Numbers_10_to_100_UsingWhile
{
	public static void main(String args[] )
	{
		//loop counter initialisation
		int i=10, sum=0;

		//print statement
		System.out.println("Output is : ");

		//loop to print sum of 1 to 10
		while(i<100)	
		{
		   sum = sum + i;
         i++;
      }
      
      System.out.println(sum);
    }
}