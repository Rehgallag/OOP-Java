// Practical 8A- Question 6
// John Gallagher
// 12 November 2019
// Program to display result on screen

public class Printing_Sum_Of_Integers_Between_1_And_100_Using_For_Loops
{
   public static void main(String [] args)
   {
      int sum=0;
      
      //print sum of 1 to 100
      for(int i=1; i<100; i++)
      {
         sum = sum + i;
      }
      System.out.print("The sum of all integers between 1 and 100 is: "+ sum);
   }
}