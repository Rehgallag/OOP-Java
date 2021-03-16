// Demo Program
// 21 October 2019
// John Gallagher

import java.util.Scanner;

public class ExamGradesNested
{
   public static void main(String[ ] args)
   {
      //declare vairable
      Scanner in = new Scanner(System.in);
      int examMark = 0;
      
      //read exam mark
      System.out.print("Enter your exam mark: ");
      examMark = in.nextInt();
      
      // make sure it's a valid mark
      if(examMark >=0 && examMark <= 100)
      {
              
            // test to see if it's a distinction
            if(examMark >= 70)
            {
                     System.out.print("Distinction");
            }
            // test to see if it's a merit
            if(examMark >= 50)
            {
                     System.out.print("Merit");
            }
            // test to see if it's a pass
            if(examMark >= 40)
            {
                     System.out.print("Pass");
            }
            else
            {
                     System.out.print("Fail");
            }
      
      }
      else
      {
               System.out.print("Invalid mark");
      
      }



   }
}