/* 2018 semester 2 
   Question 2
*/

import java.util.*;

public class arrayQuestion
{
   public static void main(String[] args)
   {
      //let's set up the array
      int[] numbers=new int[15];
      
      //lets initilise our random no generator
      Random noGen=new Random();
      
      //put random numbers into each index of our array
      for(int i=0;i<numbers.length;i++)
      {
         int number=noGen.nextInt(20)+1;
         numbers[i]= numbers;
      }
      
      
      
   }
}   