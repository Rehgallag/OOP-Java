// Practical 12A- Question 4
// John Gallagher
// 10 December 2019
// Program to display result on screen

import java.util.*;

public class TotalPrice18YearOldOrUnder{

   public static void main(String[] args){
   
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //delcare variable
      int age=0,total=0;
      
      do{
         System.out.print("Enter your age: ");
         age=in.nextInt();
         
         if(age>=18){
            total=total+10;
         }
         else if(age<18){
            total=total+5;
         }
      }while(people
   }
}