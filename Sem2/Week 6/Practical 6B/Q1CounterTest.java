// Practical 6B - Question 3
// John Gallagher
// 27 February 2020 
// Program to display result on screen

import java.util.*;

public class Q1CounterTest {
   public static void main(String[] args){
      
      Counter count1, count2;
      int sum;
      count1 = new Counter();
      count2 = new Counter();
      
      //Adds 1 to objects count1 and count2
      count1.click();
      count2.click();
      
      
      System.out.println("The current count is: " + count1.getCount() + " and " + count2.getCount());
     
      //Adds the sum of count1 and count2.
      sum = count1.getCount()  + count2.getCount();
      //Dispalys the sum of both.
      System.out.println("The sum of both is: " + sum);
      
      
      count1.reset();
      count2.reset();
      
      
      
      System.out.println("The value of both when they are reset is: " + count1.getCount() +
             " and " + count2.getCount()); 
     
   }
   
}
