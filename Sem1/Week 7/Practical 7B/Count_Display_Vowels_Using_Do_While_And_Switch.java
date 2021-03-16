// Practical 7B- Question 5
// John Gallagher
// 7 November 2019
// Program to display result on screen

import java.util.Scanner;

public class Count_Display_Vowels_Using_Do_While_And_Switch
{
   public static void main(String args[])
   {
      //create a scanner
      Scanner in = new Scanner(System.in);
      
      char letter;
      
      do{
       System.out.print("Please enter a vowel: ");
       letter = in.next().charAt(0);

        switch(letter)
        {  
            case'a':
            case'A':
               break;
            case'e':
            case'E':
               break;
            case'i':
            case'I':
               break;
            case'o':
            case'O':
               break;
            case'u':
            case'U':
               break;
            default: System.out.println("ERROR!! Please enter a vowel");
        }// end switch
        
        }while(letter != '.');
        System.out.println("You have entered a full stop and stopped the program");
   }//end main
}//end class