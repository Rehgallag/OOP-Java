// Practical 2C - Question 2
// John Gallagher
// 30 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q2DisplayStarsVerifyGradeFindGrade{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      double grade;
      System.out.print("Enter exam mark: ");
      grade=in.nextDouble();
      boolean valid = verifyGrade(grade);
      
      
      int find = findGrade(grade);
      
      
      displayStars(find);
      
   }
   
   public static void displayStars(int n){
      
      for(int i=1; i<=n; i++)
      {
         System.out.print("*");
      }
      System.out.println(" ");
   }
   
   public static boolean verifyGrade(double grade){
     if(grade >= 0 && grade <= 100){
         return true;
     }
     else{
         return false;
     }
   }
  
   public static int findGrade(double n2){
      if(n2 <= 100 & n2>=90){
         return 9;
      }
      if (n2 <= 89 & n2>=80){
         return 8;
      }
      if (n2 <= 79 & n2>=70){
         return 7;
      }
      if (n2 <= 69 & n2>=60){
         return 7;
      }
      if (n2 <= 69 & n2>=60){
         return 6;
      }
      if (n2 <= 59 & n2>=50){
         return 5;
      }
      if (n2 <= 49 & n2>=40){
         return 4;
      }
      if (n2 <= 39 & n2>=30){
         return 3;
      }
      if (n2 <= 29 & n2>=20){
         return 2;
      }
      if (n2 <= 19 & n2>=10){
         return 1;
      }
      else{
         return 0;
      }
     
   }

}
