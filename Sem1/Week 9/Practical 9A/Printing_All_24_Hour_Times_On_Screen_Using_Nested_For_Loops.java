// Practical 9A- Question 6
// John Gallagher
// 19 November 2019
// Program to display result on screen

public class Printing_All_24_Hour_Times_On_Screen_Using_Nested_For_Loops
{
   public static void main(String[] args)
   {
      for(int j=0;j<=23;j++)
      {
         for(int i=0;i<=59;i++)
         {
            System.out.println(j+":"+i+" ");
         }
         System.out.println();
      }
   }
}