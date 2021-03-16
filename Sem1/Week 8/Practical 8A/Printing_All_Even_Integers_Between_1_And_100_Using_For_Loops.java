// Practical 8A- Question 7
// John Gallagher
// 12 November 2019
// Program to display result on screen

public class Printing_All_Even_Integers_Between_1_And_100_Using_For_Loops
{
   public static void main(String [] args)
   {
      int sum=0;
      
      // print sum of all even no
      for(int i=1; i<=100; i++)
      {
         if(i % 2 == 0)
         {
            sum = sum + i;
         }
      }
      System.out.print(sum);
   }
}