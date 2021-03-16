/* Practical 8B- Question 4
   John Gallagher
   14 November 2019
   Program to display result on screen
*/

public class Calc_Amount_In_The_Bank_And_Interest_Using_For_Loops
{
   public static void main(String[] args)
   {
      int n=15;
      double interest=.1,value=20,temp=0,total=0;
      temp=value;
      
      for(int i=0;i<=n;i++)
      {
        System.out.println("Year " + i + ": " + (value + (i*interest)));      
        total = total+interest;
      }
         System.out.print("Total Interest earned after 15 years: "+total);
   }
}