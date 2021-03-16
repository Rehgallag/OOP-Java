// Practical 8A- Question 9
// John Gallagher
// 12 November 2019
// Program to display result on screen

public class Printing_Integers_Divided_By_7_And_4_Using_For_Loops
{
   public static void main(String [] args)
   {
      int sum=0;
      
      // print 1 to 100
      for(int i=1; i<=100; i++)
      {
         if(i%7==0 && i%4==0)
         {
            sum = sum + i;
         }
       
      }
        System.out.println(sum);
   }
}