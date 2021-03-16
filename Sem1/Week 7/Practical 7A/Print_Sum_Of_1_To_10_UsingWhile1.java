// Practical 7A- Question 10
// John Gallagher
// 5 November 2019
// Program to display result on screen

public class Print_Sum_Of_1_To_10_UsingWhile1
{
	public static void main(String args[] )
	{
		//loop counter initialisation
		int i=1, sum=0;

		//print statement
		System.out.println("Output is : ");

		//loop to print sum of 1 to 10
		while(i<10)	
		{
		   sum = sum + i;
         i++;
         
      }
      
      System.out.println(sum);
      
      
	}
}