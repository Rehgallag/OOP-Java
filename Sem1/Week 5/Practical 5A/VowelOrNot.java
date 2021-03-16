// Practical 5A- Question 3
// John Gallagher
// 15 October 2019
// Program to display result on screen

import java.util.Scanner;

public class VowelOrNot
{
   public static void main(String [ ] args)
   {
      //declare variable
      Scanner in = new Scanner(System.in);
      char letter;
      
      System.out.print("Enter a character : ");
      letter =  in.next().charAt(0);
      
      switch(letter)
      {
         case 'A':
         case 'a':
         case 'E':
         case 'e':
         case 'I':
         case 'i':
         case 'O':
         case 'o':
         case 'U':
         case 'u': System.out.print(letter + " is a vowel");
                  break;
         default : System.out.print(letter + " is NOT a vowel");
      
      

      }
   }
}