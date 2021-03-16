// Practical 7A- Question 9
// John Gallagher
// 5 November 2019
// Program to display result on screen

public class Print_10_To_1_Blastoff_UsingWhile
{
	public static void main(String args[] )
	{
		//loop counter initialisation
		int i=10;

		//print statement
		System.out.println("Output is : ");

		//loop to print 10 to 1.
		while(i>=0)	
		{
		   System.out.println(i);
         i=i-1;
         if (i == 0)
         {
            System.out.print("BlASTOFF!!!!");
            break;
         }
		}
	}
}