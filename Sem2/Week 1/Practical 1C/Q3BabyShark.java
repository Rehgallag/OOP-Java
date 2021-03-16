// Practical 1C- Question 3
// John Gallagher
// 24 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q3BabyShark{
   public static void main(String[] args){
      singVerse("Baby");
      singVerse("Mommy");
      singVerse("Daddy");
      singVerse("Grandma");
      singVerse("Grandpa");
      singVerseEnd("Let's go hunt");
      singVerseEnd("Run away");
      singVerseEnd("Safe at last");
      singVerseEnd("It's the end");
   }
   
   public static void singVerse(String person){
      for(int i = 1; i<=2;i++){
         System.out.print(person + " shark, ");
         for(int j = 1; j<=5;j++){
            System.out.print("doo ");
         }
         System.out.println();
      }
      System.out.println(person + " shark!");
      System.out.println();
   }
   
     public static void singVerseEnd(String action){
      for(int i = 1; i<=2;i++){
         System.out.print(action + ", ");
         for(int j = 1; j<=5;j++){
            System.out.print("doo ");
         }
         System.out.println();
      }
      System.out.println(action + "!");
      System.out.println();
   }
}