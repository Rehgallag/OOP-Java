// Practical 10A- Question 2
// John Gallagher
// 26 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Lotto_Numbers_Using_Arrays
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declare an array of 6 ints
      int[] num = new int[6]; 
      num[0]=8;
      num[1]=12;
      num[2]=18;
      num[3]=22;
      num[4]=29;
      num[5]=34;
      
      for(int i=0;i<num.length;i++)
      {
         System.out.print(num[i] +","+ " ");
      }
   }
}