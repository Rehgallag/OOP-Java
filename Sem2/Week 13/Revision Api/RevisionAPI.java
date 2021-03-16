import java.util.*;
public class RevisionAPI
{
   public static void main(String[] args)
   {
      /*
      Q1 
      A static method belongs to the class. A non-static method belongs to each instance of a class.

      Call or invoke a static method directly  without creating any instance of the class for example Math.pow(2, 3).  Use the name of the class followed by the dot operator.

      A non-static method must be called on an object or instance of the class.

      String name = "joe";
   
      int l = name.length();
      */

      /*
      Q2
      Raise a number n the power of 17.
   
      Round a variable of type double to the nearest whole number.
   
      Find the length of the third side of a triangle (i.e. the hypotenuse) when given the length of the other two sides.

      Look at the API for Math class.  Examine the methods listed and find the appropriate ones. 
      */
      int n = 2;
      System.out.println(Math.pow(n, 17) );
      System.out.println(Math.round(27.8987) );
      System.out.println(Math.hypot(3, 4) );

      /*
      Q3
      Write a segment of Java code to ask the user to enter a person’s name.  The name should be validated using the following criteria. 

      The name must be at least 4 characters long

      The name must have at least one space

      The name can only contain letters
      
      if(name.length() < 4)
      {
         System.out.println("Must have at least four letters");
      }
      
      if(!name.contains(" "))
      {
         System.out.println("Must have at least one space");
      }
      
      for(int i = 0; i < name.length(); i++)
      {
         //if the charAt(i) is not (a letter or space)
         if(!Character.isLetter(name.charAt(i)) || Character.isWhiteSpace(name.charAt(i))))
         {
            System.out.println("Invalid character - Can only contain letters");
            
            break;//break out of loop
         }
      }
      
      */
      
   }
}