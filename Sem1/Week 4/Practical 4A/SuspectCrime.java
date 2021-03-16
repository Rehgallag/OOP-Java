// Practical 4A- Extra Practice Question
// John Gallagher
// 8 October 2019
// Program to display result on screen

import java.util.Scanner;

public class SuspectCrime
{
   public static void main(String [ ] args)
   {
      //decalre variable
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      double height;
     
      
      System.out.print("Please enter you name: ");
      String name = keyboardIn.nextLine();

     
      System.out.print("Please enter your age: ");
      age = keyboardIn.nextInt();
      
      System.out.print("Please enter your height in meters: ");
      height = keyboardIn.nextDouble();
      
            if ( age >= 20 && age <=30 && height >= 1.6 && height <= 1.75)
            {
                     System.out.print(name + " is a suspect and should be interrogated");
            }
            else
            {
                     System.out.print(name + " is not a suspect and should be released");
            }
   }
}